package com.ecdc_logistics.demo;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


@Named("atct")
@SessionScoped
public class AttachmentController implements Serializable {

    private final List<XeShipmentAttachment> attachments = new ArrayList<>();
    private XeShipmentAttachment selectedAttachment;

    private StreamedContent downloadFile;

    @PostConstruct
    private void init(){
        XeShipmentAttachment attachment1= new XeShipmentAttachment();
        attachment1.setContentType("application/pdf");
        attachment1.setOriginalName("LABELS_3032_1683544279200.pdf");
        attachments.add(attachment1);

        XeShipmentAttachment attachment2= new XeShipmentAttachment();
        attachment2.setContentType("application/vnd.ms-excel");
        attachment2.setOriginalName("ECDC_X-MT_V3.xlsx");
        attachments.add(attachment2);
    }


    public void downloadAttachmentFile(XeShipmentAttachment attachment) {
        this.downloadFile = null;
        try {
            InputStream targetStream = new FileInputStream(new File("C:\\Users\\Pangb\\IdeaProjects\\demo-excel-editor\\src\\main\\webapp\\resources"+File.separator+ attachment.getOriginalName()));
            downloadFile = DefaultStreamedContent.builder()
                    .name(attachment.getOriginalName())
                    .contentType(attachment.getContentType())
                    .stream(() -> targetStream)
                    .build();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //==================================================================================================================
    public List<XeShipmentAttachment> getAttachments() {return attachments;}
    public XeShipmentAttachment getSelectedAttachment() {return selectedAttachment;}
    public void setSelectedAttachment(XeShipmentAttachment selectedAttachment) {this.selectedAttachment = selectedAttachment;}
    public StreamedContent getDownloadFile() {return downloadFile;}
}

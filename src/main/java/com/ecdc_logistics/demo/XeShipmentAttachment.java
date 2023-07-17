package com.ecdc_logistics.demo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class XeShipmentAttachment implements Serializable {


    public final static long DOC_STATUS_OK = 0;
    public final static long DOC_STATUS_WARN = 1;
    public final static long DOC_STATUS_REMOVED = 2;

    public final static long TYPE_CMR = 1;
    public final static long TYPE_T1 = 2;
    public final static long TYPE_MANIFEST = 3;
    public final static long TYPE_ID = 4;
    public final static long TYPE_INVOICE = 5;
    public final static long TYPE_AIRWAY_BILL = 6;
    public final static long TYPE_ARRIVAL_NOTICE = 7;
    public final static long TYPE_RELEASE_NOTE = 8;
    public final static long TYPE_POD = 9;
    public final static long TYPE_OTHER = 99;

    private long id;
    private LocalDateTime creation;
    private LocalDateTime update;
    private long shipment;
    private long status;
    private long relation;
    private long transportTask;
    private long docType;
    private String contentType;
    private String originalName;
    private String sysName;
    private String remark;
//    private boolean required;
//    private boolean validated;
//    private boolean removed;
//    private boolean indispensable;
    private boolean restricted;

    public XeShipmentAttachment() {}

    public XeShipmentAttachment(long shipment, long relation, long transportTask, long docType, String contentType, String originalName, String sysName, String remark, boolean restricted) {
        this.shipment = shipment;
        this.relation = relation;
        this.transportTask = transportTask;
        this.docType = docType;
        this.contentType = contentType;
        this.originalName = originalName;
        this.sysName = sysName;
        this.remark = remark;
//        this.required = required;
//        this.validated = validated;
//        this.indispensable = indispensable;
//        this.removed = removed;
        this.restricted = restricted;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public boolean isRestricted() {
        return restricted;
    }

    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }

    public long getTransportTask() {
        return transportTask;
    }

    public void setTransportTask(long transportTask) {
        this.transportTask = transportTask;
    }

    public long getRelation() {
        return relation;
    }

    public void setRelation(long relation) {
        this.relation = relation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    public LocalDateTime getUpdate() {
        return update;
    }

    public void setUpdate(LocalDateTime update) {
        this.update = update;
    }

    public long getShipment() {
        return shipment;
    }

    public void setShipment(long shipment) {
        this.shipment = shipment;
    }

    public long getDocType() {
        return docType;
    }

    public void setDocType(long docType) {
        this.docType = docType;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

}

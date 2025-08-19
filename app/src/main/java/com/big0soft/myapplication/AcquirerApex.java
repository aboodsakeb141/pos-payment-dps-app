package com.dps.pos.payment.apex.tms.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.big0soft.utils.StringUtils;
import com.dps.pos.payment.apex.tms.Mapping2TagValue;
import com.dps.pos.payment.dpsandroid.database.AppDatabase;
import com.dps.pos.payment.retrofit.annotation.TLVOptions;
import com.dps.pos.payment.utils.ReflectUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Room entity for Acquirer data
 * Table name: acquirer
 * Has a foreign key relationship with TerminalEntity
 */
@Entity(
        tableName = AppDatabase.RoomConstants.ACQUIRER_TABLE_NAME
        ,
        foreignKeys = @ForeignKey(
                entity = TerminalApex.class,
                parentColumns = "record_id",
                childColumns = "terminal_id",
                onDelete = ForeignKey.CASCADE
        ),
        indices = {@Index("terminal_id")}
)
//.Acquirer1Terminal1
public class AcquirerApex implements Serializable, TmsTagInfo, TmsRecordValidation, Mapping2TagValue {
    private static final long serialVersionUID = 6529685098267767690L;
    private String acquirerTag;
    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;

    @SerializedName("Terminal1.record_id")
    @ColumnInfo(name = "terminal_id")
    private String terminalId;

    @SerializedName("AcqMID")
    @ColumnInfo(name = "AcqMID")
    @TLVOptions(paddingLength = 16)
    private String AcqMID;
    @SerializedName("AcqName")
    @ColumnInfo(name = "AcqName")
    @TLVOptions(paddingLength = 20)
    private String acqName;
    @SerializedName("AcqTID")
    @ColumnInfo(name = "AcqTID")
    private String acqTID;
    @SerializedName("enableDoubleLengthPinKey")
    @ColumnInfo(name = "enableDoubleLengthPinKey")
    private boolean enableDoubleLengthPinKey;
    @SerializedName("enableDukpt")
    @ColumnInfo(name = "enableDukpt")
    private boolean enableDukpt;
    @SerializedName("enableEcb")
    @ColumnInfo(name = "enableEcb")
    private boolean enableEcb;
    @SerializedName("enableHoldAdvice")
    @ColumnInfo(name = "enableHoldAdvice")
    private boolean enableHoldAdvice;
    @SerializedName("enableSendBatchNum")
    @ColumnInfo(name = "enableSendBatchNum")
    private boolean enableSendBatchNum;
    @SerializedName("enableSendCurrencyCode")
    @ColumnInfo(name = "enableSendCurrencyCode")
    private boolean enableSendCurrencyCode;
    @SerializedName("hexCurrencyCode")
    @ColumnInfo(name = "hexCurrencyCode")
    private boolean hexCurrencyCode;
    @SerializedName("pinKeyIndex")
    @ColumnInfo(name = "pinKeyIndex")
    private int pinKeyIndex; // (AH - check conversion)

    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    @NonNull
    private String recordName;
    @SerializedName("sendSerialNumber")
    @ColumnInfo(name = "sendSerialNumber")
    private boolean sendSerialNumber;
    @SerializedName("txtId")
    @ColumnInfo(name = "txtId")
    private String txtId;
    @SerializedName("txtMerchCC")
    @ColumnInfo(name = "txtMerchCC")
    private String txtMerchCC;
    @SerializedName("txtSettleAttempts")
    @ColumnInfo(name = "txtSettleAttempts")
    private String txtSettleAttempts;
    @SerializedName("txtSettleTime")
    @ColumnInfo(name = "txtSettleTime")
    private String txtSettleTime;
    @SerializedName("workingKey1")
    @ColumnInfo(name = "workingKey1")
    private String workingKey1;
    @SerializedName("workingKey2")
    @ColumnInfo(name = "workingKey2")
    private String workingKey2;


    @SerializedName("enableDmsDiscount")
    @ColumnInfo(name = "enableDmsDiscount")
    private boolean enableDmsDiscount;


    public AcquirerApex() {

    }

    public String getAcquirerTag() {
        return acquirerTag;
    }

    public void setAcquirerTag(String acquirerTag) {
        this.acquirerTag = acquirerTag;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getRecordName() {
        return recordName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public boolean isEnableDmsDiscount() {
        return enableDmsDiscount;
    }

    public void setEnableDmsDiscount(boolean enableDmsDiscount) {
        this.enableDmsDiscount = enableDmsDiscount;
    }

    @NonNull
    @Override
    public String toString() {
        return "AcquirerApex{" +
               ", AcqMID='" + AcqMID + '\'' +
               ", acqName='" + acqName + '\'' +
               ", acqTID='" + acqTID + '\'' +
               ", cashOutAcquirer=" + cashOutAcquirer +
               ", cliqAcquirer=" + cliqAcquirer +
               ", enableDoubleLengthPinKey=" + enableDoubleLengthPinKey +
               ", enableDukpt=" + enableDukpt +
               ", enableEcb=" + enableEcb +
               ", enableHoldAdvice=" + enableHoldAdvice +
               ", enableInstallment=" + enableInstallment +
               ", enablePinBypass=" + enablePinBypass +
               ", enableSendBatchNum=" + enableSendBatchNum +
               ", enableSendCurrencyCode=" + enableSendCurrencyCode +
               ", enableSendInstallmentInquiry=" + enableSendInstallmentInquiry +
               ", forceInstallmentOffer=" + forceInstallmentOffer +
               ", hexCurrencyCode=" + hexCurrencyCode +
               ", pinKeyIndex=" + pinKeyIndex +
               ", recordId='" + recordId + '\'' +
               ", recordName='" + recordName + '\'' +
               ", rpmAcquirer=" + rpmAcquirer +
               ", sendSerialNumber=" + sendSerialNumber +
               ", txtCurrentBatchNum='" + txtCurrentBatchNum + '\'' +
               ", txtId='" + txtId + '\'' +
               ", txtMerchCC='" + txtMerchCC + '\'' +
               ", txtNextBatchNum='" + txtNextBatchNum + '\'' +
               ", txtSettleAttempts='" + txtSettleAttempts + '\'' +
               ", txtSettleTime='" + txtSettleTime + '\'' +
               ", workingKey1='" + workingKey1 + '\'' +
               ", workingKey2='" + workingKey2 + '\'' +
               '}';
    }

    public String getAcqMID() {
        return AcqMID;
    }

    public void setAcqMID(String acqMID) {
        this.AcqMID = acqMID;
    }

    public String getAcqName() {
        return acqName;
    }

    public void setAcqName(String acqName) {
        this.acqName = acqName;
    }

    public String getAcqTID() {
        return acqTID;
    }

    public void setAcqTID(String acqTID) {
        this.acqTID = acqTID;
    }

    public boolean isCashOutAcquirer() {
        return cashOutAcquirer;
    }

    public void setCashOutAcquirer(boolean cashOutAcquirer) {
        this.cashOutAcquirer = cashOutAcquirer;
    }

    public boolean isCliqAcquirer() {
        return cliqAcquirer;
    }

    public void setCliqAcquirer(boolean cliqAcquirer) {
        this.cliqAcquirer = cliqAcquirer;
    }

    public boolean isEnableDoubleLengthPinKey() {
        return enableDoubleLengthPinKey;
    }

    public void setEnableDoubleLengthPinKey(boolean enableDoubleLengthPinKey) {
        this.enableDoubleLengthPinKey = enableDoubleLengthPinKey;
    }

    public boolean isEnableDukpt() {
        return enableDukpt;
    }

    public void setEnableDukpt(boolean enableDukpt) {
        this.enableDukpt = enableDukpt;
    }

    public boolean isEnableEcb() {
        return enableEcb;
    }

    public void setEnableEcb(boolean enableEcb) {
        this.enableEcb = enableEcb;
    }

    public boolean isEnableHoldAdvice() {
        return enableHoldAdvice;
    }

    public void setEnableHoldAdvice(boolean enableHoldAdvice) {
        this.enableHoldAdvice = enableHoldAdvice;
    }

    public boolean isEnableInstallment() {
        return enableInstallment;
    }

    public void setEnableInstallment(boolean enableInstallment) {
        this.enableInstallment = enableInstallment;
    }

    public boolean isEnablePinBypass() {
        return enablePinBypass;
    }

    public void setEnablePinBypass(boolean enablePinBypass) {
        this.enablePinBypass = enablePinBypass;
    }

    public boolean isEnableSendBatchNum() {
        return enableSendBatchNum;
    }

    public void setEnableSendBatchNum(boolean enableSendBatchNum) {
        this.enableSendBatchNum = enableSendBatchNum;
    }

    public boolean isEnableSendCurrencyCode() {
        return enableSendCurrencyCode;
    }

    public void setEnableSendCurrencyCode(boolean enableSendCurrencyCode) {
        this.enableSendCurrencyCode = enableSendCurrencyCode;
    }

    public boolean isEnableSendInstallmentInquiry() {
        return enableSendInstallmentInquiry;
    }

    public void setEnableSendInstallmentInquiry(boolean enableSendInstallmentInquiry) {
        this.enableSendInstallmentInquiry = enableSendInstallmentInquiry;
    }

    public boolean isForceInstallmentOffer() {
        return forceInstallmentOffer;
    }

    public void setForceInstallmentOffer(boolean forceInstallmentOffer) {
        this.forceInstallmentOffer = forceInstallmentOffer;
    }

    public boolean isHexCurrencyCode() {
        return hexCurrencyCode;
    }

    public void setHexCurrencyCode(boolean hexCurrencyCode) {
        this.hexCurrencyCode = hexCurrencyCode;
    }

    public int getPinKeyIndex() {
        return pinKeyIndex;
    }

    public void setPinKeyIndex(int pinKeyIndex) {
        this.pinKeyIndex = pinKeyIndex;
    }


    public boolean isRpmAcquirer() {
        return rpmAcquirer;
    }

    public void setRpmAcquirer(boolean rpmAcquirer) {
        this.rpmAcquirer = rpmAcquirer;
    }

    public boolean isSendSerialNumber() {
        return sendSerialNumber;
    }

    public void setSendSerialNumber(boolean sendSerialNumber) {
        this.sendSerialNumber = sendSerialNumber;
    }

    public String getTxtCurrentBatchNum() {
        return txtCurrentBatchNum;
    }

    public void setTxtCurrentBatchNum(String txtCurrentBatchNum) {
        this.txtCurrentBatchNum = txtCurrentBatchNum;
    }

    public String getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }

    public String getTxtMerchCC() {
        return txtMerchCC;
    }

    public void setTxtMerchCC(String txtMerchCC) {
        this.txtMerchCC = txtMerchCC;
    }

    public String getTxtNextBatchNum() {
        return txtNextBatchNum;
    }

    public void setTxtNextBatchNum(String txtNextBatchNum) {
        this.txtNextBatchNum = txtNextBatchNum;
    }

    public String getTxtSettleAttempts() {
        return txtSettleAttempts;
    }

    public void setTxtSettleAttempts(String txtSettleAttempts) {
        this.txtSettleAttempts = txtSettleAttempts;
    }

    public String getTxtSettleTime() {
        return txtSettleTime;
    }

    public void setTxtSettleTime(String txtSettleTime) {
        this.txtSettleTime = txtSettleTime;
    }

    public String getWorkingKey1() {
        return workingKey1;
    }

    public void setWorkingKey1(String workingKey1) {
        this.workingKey1 = workingKey1;
    }

    public String getWorkingKey2() {
        return workingKey2;
    }

    public void setWorkingKey2(String workingKey2) {
        this.workingKey2 = workingKey2;
    }

    @Override
    public String tagPrefix() {
        return acquirerTag;
    }

    @Override
    @Ignore
    public String recordId() {
        return recordId;
    }

    @Override
    @Ignore
    public String recordName() {
        return recordName;
    }

    @Override
    public void setTagPrefix(String prefix) {
        acquirerTag = prefix;
    }

    @Override
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Override
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    @Override
    public boolean isValid() {
        return !StringUtils.isEmpty(recordId);
    }

    @Override
    public List<TagValue> toTagValue() {
        return ReflectUtils.getTagValues(this);
    }
}

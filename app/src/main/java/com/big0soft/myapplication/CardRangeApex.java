package com.dps.pos.payment.apex.tms.model;

import androidx.annotation.NonNull;
import androidx.room.*;
import com.dps.pos.payment.apex.tms.Mapping2TagValue;
import com.dps.pos.payment.dpsandroid.database.AppDatabase;
import com.dps.pos.payment.retrofit.annotation.TLVOptions;
import com.dps.pos.payment.utils.ReflectUtils;
import com.big0soft.utils.StringUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Room entity for Card Range data
 * Table name: card_range
 * Has a foreign key relationship with IssuerEntity
 */
@Entity(
        tableName = AppDatabase.RoomConstants.CARD_RANGE_TABLE_NAME,
        foreignKeys = {
                @ForeignKey(
                        entity = TerminalApex.class,
                        parentColumns = "record_id",
                        childColumns = "terminal_id",
                        onDelete = ForeignKey.CASCADE),
                @ForeignKey(
                        entity = IssuerApex.class,
                        parentColumns = "record_id",
                        childColumns = "issuer_id",
                        onDelete = ForeignKey.CASCADE),
                @ForeignKey(
                        entity = AcquirerApex.class,
                        parentColumns = "record_id",
                        childColumns = "acquirer_id",
                        onDelete = ForeignKey.CASCADE
                )},
        indices = {@Index("issuer_id"), @Index("acquirer_id"),@Index("terminal_id")}
)
//Terminal1.Acquirer1.Issuer2.BinList1.BinRange1
public class CardRangeApex implements Serializable, TmsTagInfo, TmsRecordValidation, Mapping2TagValue {
    private static final long serialVersionUID = 6529675098267767690L;
    @ColumnInfo(name = "issuer_id")
    private String issuerId;
    @ColumnInfo(name = "acquirer_id")
    private String acquirerId;

    private int cardRangeId;
    @SerializedName("Terminal1.record_id")
    @ColumnInfo(name = "terminal_id")
    private String terminalId;
    @SerializedName("BinHigh")
    @ColumnInfo(name = "BinHigh")
    private String binHigh;
    @SerializedName("BinLow")
    @ColumnInfo(name = "BinLow")
    private String binLow;
    @SerializedName("CurrencyCode")
    @ColumnInfo(name = "CurrencyCode")
    private String currencyCode;
    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;

    private String cardRangeIssTag;
    private String cardRangeAcqTag;

    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    private String recordName;
    @SerializedName("txtId")
    @ColumnInfo(name = "txtId")
    private String txtId;
    @SerializedName("txtMatchLength")
    @ColumnInfo(name = "txtMatchLength")
    private String txtMatchLength;
    @SerializedName("txtName")
    @ColumnInfo(name = "txtName")
    @TLVOptions(paddingLength = 20)
    private String txtName;

    @NonNull
    @Override
    public String toString() {
        return "CardRangeApex{" +
               "issuerId=" + issuerId +
               ", acquirerId=" + acquirerId +
               ", cardRangeId=" + cardRangeId +
               ", binHigh='" + binHigh + '\'' +
               ", binLow='" + binLow + '\'' +
               ", currencyCode='" + currencyCode + '\'' +
               ", enableLocalBin=" + enableLocalBin +
               ", recordId='" + recordId + '\'' +
               ", recordName='" + recordName + '\'' +
               ", txtId='" + txtId + '\'' +
               ", txtMatchLength='" + txtMatchLength + '\'' +
               ", txtName='" + txtName + '\'' +
               '}';
    }

    public String getCardRangeIssTag() {
        return cardRangeIssTag;
    }

    public String getCardRangeAcqTag() {
        return cardRangeAcqTag;
    }

    public void setCardRangeAcqTag(String cardRangeAcqTag) {
        this.cardRangeAcqTag = cardRangeAcqTag;
    }

    public void setCardRangeIssTag(String cardRangeTag) {
        this.cardRangeIssTag = cardRangeTag;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getRecordName() {
        return recordName;
    }

    public CardRangeApex() {
    }

    public int getCardRangeId() {
        return cardRangeId;
    }

    public void setCardRangeId(int cardRangeId) {
        this.cardRangeId = cardRangeId;
    }

    public String getIssuerId() {
        return issuerId;
    }


    public String getAcquirerId() {
        return acquirerId;
    }
    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    public String getBinHigh() {
        return binHigh;
    }

    public void setBinHigh(String binHigh) {
        this.binHigh = binHigh;
    }

    public String getBinLow() {
        return binLow;
    }

    public void setBinLow(String binLow) {
        this.binLow = binLow;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public boolean isEnableLocalBin() {
        return enableLocalBin;
    }

    public void setEnableLocalBin(boolean enableLocalBin) {
        this.enableLocalBin = enableLocalBin;
    }


    public String getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }

    public String getTxtMatchLength() {
        return txtMatchLength;
    }

    public void setTxtMatchLength(String txtMatchLength) {
        this.txtMatchLength = txtMatchLength;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    @Override
    public String tagPrefix() {
        return "";
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

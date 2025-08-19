package com.dps.pos.payment.apex.tms.model;

import androidx.annotation.NonNull;
import androidx.room.*;

import com.big0soft.utils.PrimitiveHandlerUtils;
import com.big0soft.utils.StringUtils;
import com.dps.pos.payment.R;
import com.dps.pos.payment.apex.tms.Mapping2TagValue;
import com.dps.pos.payment.dpsandroid.database.AppDatabase;
import com.dps.pos.payment.exception.BcdConvertException;
import com.dps.pos.payment.exception.HexConvertException;
import com.dps.pos.payment.nexgo.mapper.MappableToAidEntity;
import com.dps.pos.payment.utils.ConvertUtils;
import com.dps.pos.payment.utils.ReflectUtils;
import com.google.gson.annotations.SerializedName;
import com.nexgo.oaf.apiv3.emv.AidEntity;
import com.nexgo.oaf.apiv3.emv.AidEntryModeEnum;

import java.io.Serializable;
import java.util.List;

/**
 * Room entity for Contact AID (Application Identifier) data
 * Table name: contact_aid
 */
@Entity(tableName = AppDatabase.RoomConstants.CONTACT_AID_LIST_TABLE_NAME,
        foreignKeys = @ForeignKey(
                entity = TerminalApex.class,
                parentColumns = "record_id",
                childColumns = "terminal_id",
                onDelete = ForeignKey.CASCADE
        ),
        indices = {@Index("terminal_id")})
//Terminal1.AidList1.Aid1
public class ContactAidListApex implements Serializable, TmsTagInfo, MappableToAidEntity, TmsRecordValidation, Mapping2TagValue {
    private static final long serialVersionUID = -4582340239647312411L;
    @SerializedName("Terminal1.record_id")
    @ColumnInfo(name = "terminal_id")
    private String terminalId;
    @SerializedName("aid")
    @ColumnInfo(name = "aid")
    private String aid;
    @SerializedName("aidId")
    @ColumnInfo(name = "aidId")
    private String aidId;
    @SerializedName("aidLength")
    @ColumnInfo(name = "aidLength")
    private String aidLength;
    @SerializedName("aidName")
    @ColumnInfo(name = "aidName")
    private String aidName;
    @SerializedName("dDOL")
    @ColumnInfo(name = "dDOL")
    private String dDOL;
    @SerializedName("ExactMatch")
    @ColumnInfo(name = "ExactMatch")
    private String exactMatch;
    @SerializedName("FloorLimit")
    @ColumnInfo(name = "FloorLimit")
    private String floorLimit;
    @SerializedName("FloorLimitCheck")
    @ColumnInfo(name = "FloorLimitCheck")
    private String floorLimitCheck;
    @SerializedName("MaxTargetPer")
    @ColumnInfo(name = "MaxTargetPer")
    private String maxTargetPer;
    @SerializedName("RandTransSel")
    @ColumnInfo(name = "RandTransSel")
    private String randTransSel;

    @SerializedName("RiskManData")
    @ColumnInfo(name = "RiskManData")
    private String riskManData;
    @SerializedName("TACDefault")
    @ColumnInfo(name = "TACDefault")
    private String tacDefault;
    @SerializedName("TACDenial")
    @ColumnInfo(name = "TACDenial")
    private String tacDenial;
    @SerializedName("TACOnline")
    @ColumnInfo(name = "TACOnline")
    private String tacOnline;
    @SerializedName("TargetPer")
    @ColumnInfo(name = "TargetPer")
    private String targetPer;
    @SerializedName("tDOL")
    @ColumnInfo(name = "tDOL")
    private String tDOL;
    @SerializedName("Threshold")
    @ColumnInfo(name = "Threshold")
    private String threshold;
    @SerializedName("VelocityCheck")
    @ColumnInfo(name = "VelocityCheck")
    private String velocityCheck;
    @SerializedName("Version")
    @ColumnInfo(name = "Version")
    private String version;

    /**
     * apex doc
     * this value come from {@link TerminalApex#getMaxTxnLimit()}
     */
    private String transLimit;
    @Ignore
    public ContactAidListApex(String contactAidTag) {
        this.contactAidTag = contactAidTag;
    }

    public ContactAidListApex() {
    }

    private String contactAidTag;
    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;
    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    private String recordName;

    @Override
    public String tagPrefix() {
        return contactAidTag;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAidId() {
        return aidId;
    }

    public void setAidId(String aidId) {
        this.aidId = aidId;
    }

    public String getAidLength() {
        return aidLength;
    }

    public void setAidLength(String aidLength) {
        this.aidLength = aidLength;
    }

    public String getAidName() {
        return aidName;
    }

    public void setAidName(String aidName) {
        this.aidName = aidName;
    }

    public String getDDOL() {
        return dDOL;
    }

    public void setDDOL(String dDOL) {
        this.dDOL = dDOL;
    }

    public String getEmvCashTxnType() {
        return emvCashTxnType;
    }

    public void setEmvCashTxnType(String emvCashTxnType) {
        this.emvCashTxnType = emvCashTxnType;
    }

    public String getEnableCheckTrack2AndTag57() {
        return enableCheckTrack2AndTag57;
    }

    public void setEnableCheckTrack2AndTag57(String enableCheckTrack2AndTag57) {
        this.enableCheckTrack2AndTag57 = enableCheckTrack2AndTag57;
    }
    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
    public String getExactMatch() {
        return exactMatch;
    }

    public void setExactMatch(String exactMatch) {
        this.exactMatch = exactMatch;
    }

    public String getFloorLimit() {
        return floorLimit;
    }

    public void setFloorLimit(String floorLimit) {
        this.floorLimit = floorLimit;
    }

    public String getFloorLimitCheck() {
        return floorLimitCheck;
    }

    public void setFloorLimitCheck(String floorLimitCheck) {
        this.floorLimitCheck = floorLimitCheck;
    }

    public String getMaxTargetPer() {
        return maxTargetPer;
    }

    public void setMaxTargetPer(String maxTargetPer) {
        this.maxTargetPer = maxTargetPer;
    }

    public String getRandTransSel() {
        return randTransSel;
    }

    public void setRandTransSel(String randTransSel) {
        this.randTransSel = randTransSel;
    }


    public String getRiskManData() {
        return riskManData;
    }

    public void setRiskManData(String riskManData) {
        this.riskManData = riskManData;
    }

    public String getTacDefault() {
        return tacDefault;
    }

    public void setTacDefault(String tacDefault) {
        this.tacDefault = tacDefault;
    }

    public String getTacDenial() {
        return tacDenial;
    }

    public void setTacDenial(String tacDenial) {
        this.tacDenial = tacDenial;
    }

    public String getTacOnline() {
        return tacOnline;
    }

    public void setTacOnline(String tacOnline) {
        this.tacOnline = tacOnline;
    }

    public String getTargetPer() {
        return targetPer;
    }

    public void setTargetPer(String targetPer) {
        this.targetPer = targetPer;
    }

    public String getTDOL() {
        return tDOL;
    }

    public void setTDOL(String tDOL) {
        this.tDOL = tDOL;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public String getVelocityCheck() {
        return velocityCheck;
    }

    public void setVelocityCheck(String velocityCheck) {
        this.velocityCheck = velocityCheck;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion2() {
        return version2;
    }

    public void setVersion2(String version2) {
        this.version2 = version2;
    }

    public String getVersion3() {
        return version3;
    }

    public void setVersion3(String version3) {
        this.version3 = version3;
    }

    public String getTransLimit() {
        return transLimit;
    }

    public void setTransLimit(String transLimit) {
        this.transLimit = transLimit;
    }

    public String getContactAidTag() {
        return contactAidTag;
    }

    public void setContactAidTag(String contactAidTag) {
        this.contactAidTag = contactAidTag;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getRecordName() {
        return recordName;
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
        contactAidTag = prefix;
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
    public AidEntity toAidEntity() {
        AidEntity entity = new AidEntity();
        int aidLength = ConvertUtils.bcdStringToInt(this.aidLength);
        String aid = org.apache.commons.lang3.StringUtils.substring(this.aid, 0, aidLength*2);
        boolean exactMatch = PrimitiveHandlerUtils.string2Boolean(this.exactMatch);
        int asi = exactMatch ? 1 : 0;
        int maxTargetPercent = 0;
        try {
            maxTargetPercent = ConvertUtils.bcdStringToInt(this.maxTargetPer);
        } catch (Exception e) {
            throw new BcdConvertException(this.maxTargetPer, R.string.invalid_max_target_percent);
        }
        int targetPercent = ConvertUtils.bcdStringToInt(this.targetPer);
        int onlinePinCap = 1;
        long floorLimit = 0;
        try {
            floorLimit = ConvertUtils.hexStringToLong(this.floorLimit);
        } catch (Exception e) {
            throw new HexConvertException(this.floorLimit, R.string.invalid_floor_limit);
        }
        long transLimit = 0;
        try {
            transLimit = com.big0soft.utils.ConvertUtils.bcdStringToLong(this.transLimit);
        } catch (Exception e) {
            throw new HexConvertException(this.transLimit, R.string.invalid_transLimit);
        }
        long threshold = 0;
        try {
            threshold = ConvertUtils.hexStringToLong(this.threshold);
        } catch (Exception e) {
            throw new HexConvertException(this.transLimit, R.string.invalid_threshold);
        }

        entity.setAid(aid);
        entity.setAsi(asi);
        entity.setTacDefault(this.tacDefault);
        entity.setTacOnline(this.tacOnline);
        entity.setTacDenial(this.tacDenial);
        entity.setAppVerNum(this.version);
        // TODO: 4/18/2025 we have 2 setter for ddol and 2 getter for ddol in entity
        entity.setDDOL(this.dDOL);
        entity.setDdol(this.dDOL);
        entity.setThreshold(threshold);
        entity.setMaxTargetPercent(maxTargetPercent);
        entity.setTargetPercent(targetPercent);
        entity.setOnlinePinCap(onlinePinCap);
        entity.setFloorLimit(floorLimit);
//        entity.setTransType("FF");
        entity.setAidEntryModeEnum(AidEntryModeEnum.AID_ENTRY_CONTACT);
        entity.setTransLimit(transLimit);
//        entity.setExtendedSelection(0);
        return entity;
    }

    @Override
    public List<TagValue> toTagValue() {
        return ReflectUtils.getTagValues(this);
    }
}

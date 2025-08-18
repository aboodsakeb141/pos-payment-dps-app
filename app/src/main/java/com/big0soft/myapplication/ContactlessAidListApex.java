package com.dps.pos.payment.apex.tms.model;

import androidx.annotation.NonNull;
import androidx.room.*;

import com.big0soft.utils.ConvertUtils;
import com.big0soft.utils.StringUtils;
import com.dps.pos.payment.R;
import com.dps.pos.payment.apex.tms.Mapping2TagValue;
import com.dps.pos.payment.dpsandroid.database.AppDatabase;
import com.dps.pos.payment.exception.BcdConvertException;
import com.dps.pos.payment.nexgo.mapper.MappableToAidEntity;
import com.dps.pos.payment.retrofit.annotation.TLVOptions;
import com.dps.pos.payment.utils.ReflectUtils;
import com.google.gson.annotations.SerializedName;
import com.nexgo.oaf.apiv3.emv.AidEntity;
import com.nexgo.oaf.apiv3.emv.AidEntryModeEnum;

import java.io.Serializable;
import java.util.List;

/**
 * Room entity for Contactless AID (Application Identifier) data
 * Table name: contactless_aid
 */
@Entity(tableName = AppDatabase.RoomConstants.CONTACTLESS_AID_LIST_TABLE_NAME,
        foreignKeys = @ForeignKey(
                entity = TerminalApex.class,
                parentColumns = "record_id",
                childColumns = "terminal_id",
                onDelete = ForeignKey.CASCADE
        ),
        indices = {@Index("terminal_id")})
public class ContactlessAidListApex implements Serializable, TmsTagInfo, MappableToAidEntity, TmsRecordValidation , Mapping2TagValue {
    private static final long serialVersionUID = 6529685098267767790L;
    @SerializedName("Terminal1.record_id")
    @ColumnInfo(name = "terminal_id")
    private String terminalId;
    private String contactLessAidTag;
    @SerializedName("AdditionalTags1")
    @ColumnInfo(name = "AdditionalTags1")
    private String additionalTags1;
    @SerializedName("AdditionalTags2")
    @ColumnInfo(name = "AdditionalTags2")
    private String additionalTags2;
    @SerializedName("AdditionalTags3")
    @ColumnInfo(name = "AdditionalTags3")
    private String additionalTags3;
    @SerializedName("AdditionalTags4")
    @ColumnInfo(name = "AdditionalTags4")
    private String additionalTags4;
    @SerializedName("AdditionalTags5")
    @ColumnInfo(name = "AdditionalTags5")
    private String additionalTags5;
    @SerializedName("addTagsLen")
    @ColumnInfo(name = "addTagsLen")
    private String addTagsLen;
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
    @TLVOptions(paddingLength = 20)
    private String aidName;

    @SerializedName("bCLAppNotAllowed")
    @ColumnInfo(name = "bCLAppNotAllowed")
    private String bCLAppNotAllowed;
    @SerializedName("bCVMLimitCheck")
    @ColumnInfo(name = "bCVMLimitCheck")
    private String bCVMLimitCheck;
    @SerializedName("bDisableDccAboveCVM")
    @ColumnInfo(name = "bDisableDccAboveCVM")
    private String bDisableDccAboveCVM;
    @SerializedName("bDisableDccBelowCVM")
    @ColumnInfo(name = "bDisableDccBelowCVM")
    private String bDisableDccBelowCVM;
    @SerializedName("bFloorLimitCheck")
    @ColumnInfo(name = "bFloorLimitCheck")
    private String bFloorLimitCheck;
    @SerializedName("bHasFloorLimit")
    @ColumnInfo(name = "bHasFloorLimit")
    private String bHasFloorLimit;
    @SerializedName("bStatusCheck")
    @ColumnInfo(name = "bStatusCheck")
    private String bStatusCheck;
    @SerializedName("bTransLimitCheck")
    @ColumnInfo(name = "bTransLimitCheck")
    private String bTransLimitCheck;
    @SerializedName("bZeroAmtCheck")
    @ColumnInfo(name = "bZeroAmtCheck")
    private String bZeroAmtCheck;
    @SerializedName("CVMCapabilityCVM")
    @ColumnInfo(name = "CVMCapabilityCVM")
    private String cvmCapabilityCVM;
    @SerializedName("CVMCapabilityNoCVM")
    @ColumnInfo(name = "CVMCapabilityNoCVM")
    private String cvmCapabilityNoCVM;
    @SerializedName("CVMLimit")
    @ColumnInfo(name = "CVMLimit")
    private String cvmLimit;
    @SerializedName("dDOL1")
    @ColumnInfo(name = "dDOL1")
    private String dDOL1;
    @SerializedName("dDolLen")
    @ColumnInfo(name = "dDolLen")
    private String dDolLen;
    @SerializedName("EnhancedClCapbilities")
    @ColumnInfo(name = "EnhancedClCapbilities")
    private String enhancedClCapbilities;
    @SerializedName("FloorLimit")
    @ColumnInfo(name = "FloorLimit")
    private String floorLimit;
    @SerializedName("KernelConfig")
    @ColumnInfo(name = "KernelConfig")
    private String kernelConfig;
    @SerializedName("KernelID")
    @ColumnInfo(name = "KernelID")
    private String kernelID;
    @SerializedName("MagCVMCapabilityCVM")
    @ColumnInfo(name = "MagCVMCapabilityCVM")
    private String magCVMCapabilityCVM;
    @SerializedName("MagCVMCapabilityNoCVM")
    @ColumnInfo(name = "MagCVMCapabilityNoCVM")
    private String magCVMCapabilityNoCVM;
    @SerializedName("MagStripeAVN")
    @ColumnInfo(name = "MagStripeAVN")
    private String magStripeAVN;
    @SerializedName("priority")
    @ColumnInfo(name = "priority")
    private String priority;
    @SerializedName("RandomNumberScope")
    @ColumnInfo(name = "RandomNumberScope")
    private String randomNumberScope;
    @SerializedName("RiskManData")
    @ColumnInfo(name = "RiskManData")
    private String riskManData;
    @SerializedName("SelFlag")
    @ColumnInfo(name = "SelFlag")
    private String selFlag;
    @SerializedName("TACDefault")
    @ColumnInfo(name = "TACDefault")
    private String tacDefault;
    @SerializedName("TACDenial")
    @ColumnInfo(name = "TACDenial")
    private String tacDenial;
    @SerializedName("TACOnline")
    @ColumnInfo(name = "TACOnline")
    private String tacOnline;
    @SerializedName("tDOL1")
    @ColumnInfo(name = "tDOL1")
    private String tDOL1;
    @SerializedName("tDolLen")
    @ColumnInfo(name = "tDolLen")
    private String tDolLen;
    @SerializedName("TransLimit")
    @ColumnInfo(name = "TransLimit")
    private String contactlessTransLimit;
    @SerializedName("TransLimitODCVM")
    @ColumnInfo(name = "TransLimitODCVM")
    private String transLimitODCVM;
    @SerializedName("TTQ")
    @ColumnInfo(name = "TTQ")
    private String ttq;
    @SerializedName("uDOL1")
    @ColumnInfo(name = "uDOL1")
    private String uDOL1;
    @SerializedName("uDOL2")
    @ColumnInfo(name = "uDOL2")
    private String uDOL2;
    @SerializedName("uDOL3")
    @ColumnInfo(name = "uDOL3")
    private String uDOL3;
    @SerializedName("uDOL4")
    @ColumnInfo(name = "uDOL4")
    private String uDOL4;
    @SerializedName("uDolLen")
    @ColumnInfo(name = "uDolLen")
    private String uDolLen;
    @SerializedName("Version")
    @ColumnInfo(name = "Version")
    private String version;
    @SerializedName("ZeroAmtCheckOpt")
    @ColumnInfo(name = "ZeroAmtCheckOpt")
    private String zeroAmtCheckOpt;


    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;
    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    private String recordName;

    @SerializedName("termFloorLimit")
    @ColumnInfo(name = "termFloorLimit")
    private String termFloorLimit;
    @SerializedName("transLimitNoODCVM")
    @ColumnInfo(name = "transLimitNoODCVM")
    private String transLimitNoODCVM;


    /**
     * apex doc
     * this value come from {@link TerminalApex#getMaxTxnLimit()}
     */
    @ColumnInfo(name = "trans_limit")
    private String transLimit;

    public String getAidId() {
        return aidId;
    }

    public void setAidId(String aidId) {
        this.aidId = aidId;
    }

    public String getTransLimit() {
        return transLimit;
    }

    public void setTransLimit(String transLimit) {
        this.transLimit = transLimit;
    }

    public ContactlessAidListApex() {
    }

    @Ignore
    public ContactlessAidListApex(String contactLessAidTag) {
        this.contactLessAidTag = contactLessAidTag;
    }

    public String getContactLessAidTag() {
        return contactLessAidTag;
    }

    public void setContactLessAidTag(String contactLessAidTag) {
        this.contactLessAidTag = contactLessAidTag;
    }

    public String getAdditionalTags1() {
        return additionalTags1;
    }

    public void setAdditionalTags1(String additionalTags1) {
        this.additionalTags1 = additionalTags1;
    }

    public String getAdditionalTags2() {
        return additionalTags2;
    }

    public void setAdditionalTags2(String additionalTags2) {
        this.additionalTags2 = additionalTags2;
    }

    public String getAdditionalTags3() {
        return additionalTags3;
    }

    public void setAdditionalTags3(String additionalTags3) {
        this.additionalTags3 = additionalTags3;
    }

    public String getAdditionalTags4() {
        return additionalTags4;
    }

    public void setAdditionalTags4(String additionalTags4) {
        this.additionalTags4 = additionalTags4;
    }

    public String getAdditionalTags5() {
        return additionalTags5;
    }

    public void setAdditionalTags5(String additionalTags5) {
        this.additionalTags5 = additionalTags5;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getRecordName() {
        return recordName;
    }

    public String getTermFloorLimit() {
        return this.termFloorLimit;
    }

    public void setTermFloorLimit(String termFloorLimit) {
        this.termFloorLimit = termFloorLimit;
    }

    public String getTransLimitNoODCVM() {
        return this.transLimitNoODCVM;
    }

    public void setTransLimitNoODCVM(String transLimitNoODCVM) {
        this.transLimitNoODCVM = transLimitNoODCVM;
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

    public String getBCLAppNotAllowed() {
        return bCLAppNotAllowed;
    }

    public void setBCLAppNotAllowed(String bCLAppNotAllowed) {
        this.bCLAppNotAllowed = bCLAppNotAllowed;
    }

    public String getBCVMLimitCheck() {
        return bCVMLimitCheck;
    }

    public void setBCVMLimitCheck(String bCVMLimitCheck) {
        this.bCVMLimitCheck = bCVMLimitCheck;
    }

    public String getBDisableDccAboveCVM() {
        return bDisableDccAboveCVM;
    }

    public void setBDisableDccAboveCVM(String bDisableDccAboveCVM) {
        this.bDisableDccAboveCVM = bDisableDccAboveCVM;
    }

    public String getBDisableDccBelowCVM() {
        return bDisableDccBelowCVM;
    }

    public void setBDisableDccBelowCVM(String bDisableDccBelowCVM) {
        this.bDisableDccBelowCVM = bDisableDccBelowCVM;
    }

    public String getBFloorLimitCheck() {
        return bFloorLimitCheck;
    }

    public void setBFloorLimitCheck(String bFloorLimitCheck) {
        this.bFloorLimitCheck = bFloorLimitCheck;
    }

    public String getBHasFloorLimit() {
        return bHasFloorLimit;
    }

    public void setBHasFloorLimit(String bHasFloorLimit) {
        this.bHasFloorLimit = bHasFloorLimit;
    }

    public String getBStatusCheck() {
        return bStatusCheck;
    }

    public void setBStatusCheck(String bStatusCheck) {
        this.bStatusCheck = bStatusCheck;
    }

    public String getBTransLimitCheck() {
        return bTransLimitCheck;
    }

    public void setBTransLimitCheck(String bTransLimitCheck) {
        this.bTransLimitCheck = bTransLimitCheck;
    }

    public String getBZeroAmtCheck() {
        return bZeroAmtCheck;
    }

    public void setBZeroAmtCheck(String bZeroAmtCheck) {
        this.bZeroAmtCheck = bZeroAmtCheck;
    }

    public String getCvmCapabilityCVM() {
        return cvmCapabilityCVM;
    }

    public void setCvmCapabilityCVM(String cvmCapabilityCVM) {
        this.cvmCapabilityCVM = cvmCapabilityCVM;
    }

    public String getCvmCapabilityNoCVM() {
        return cvmCapabilityNoCVM;
    }

    public void setCvmCapabilityNoCVM(String cvmCapabilityNoCVM) {
        this.cvmCapabilityNoCVM = cvmCapabilityNoCVM;
    }

    public String getCvmLimit() {
        return cvmLimit;
    }

    public void setCvmLimit(String cvmLimit) {
        this.cvmLimit = cvmLimit;
    }

    public String getDDOL1() {
        return dDOL1;
    }

    public void setDDOL1(String dDOL1) {
        this.dDOL1 = dDOL1;
    }

    public String getDDolLen() {
        return dDolLen;
    }

    public void setDDolLen(String dDolLen) {
        this.dDolLen = dDolLen;
    }

    public String getEnhancedClCapbilities() {
        return enhancedClCapbilities;
    }

    public void setEnhancedClCapbilities(String enhancedClCapbilities) {
        this.enhancedClCapbilities = enhancedClCapbilities;
    }

    public String getFloorLimit() {
        return floorLimit;
    }

    public void setFloorLimit(String floorLimit) {
        this.floorLimit = floorLimit;
    }

    public String getKernelConfig() {
        return kernelConfig;
    }

    public void setKernelConfig(String kernelConfig) {
        this.kernelConfig = kernelConfig;
    }

    public String getKernelID() {
        return kernelID;
    }

    public void setKernelID(String kernelID) {
        this.kernelID = kernelID;
    }

    public String getMagCVMCapabilityCVM() {
        return magCVMCapabilityCVM;
    }

    public void setMagCVMCapabilityCVM(String magCVMCapabilityCVM) {
        this.magCVMCapabilityCVM = magCVMCapabilityCVM;
    }

    public String getMagCVMCapabilityNoCVM() {
        return magCVMCapabilityNoCVM;
    }

    public void setMagCVMCapabilityNoCVM(String magCVMCapabilityNoCVM) {
        this.magCVMCapabilityNoCVM = magCVMCapabilityNoCVM;
    }

    public String getMagStripeAVN() {
        return magStripeAVN;
    }

    public void setMagStripeAVN(String magStripeAVN) {
        this.magStripeAVN = magStripeAVN;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getRandomNumberScope() {
        return randomNumberScope;
    }

    public void setRandomNumberScope(String randomNumberScope) {
        this.randomNumberScope = randomNumberScope;
    }

    public String getRiskManData() {
        return riskManData;
    }

    public void setRiskManData(String riskManData) {
        this.riskManData = riskManData;
    }

    public String getSelFlag() {
        return selFlag;
    }

    public void setSelFlag(String selFlag) {
        this.selFlag = selFlag;
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

    public String getTDOL1() {
        return tDOL1;
    }

    public void setTDOL1(String tDOL1) {
        this.tDOL1 = tDOL1;
    }

    public String getTDolLen() {
        return tDolLen;
    }

    public void setTDolLen(String tDolLen) {
        this.tDolLen = tDolLen;
    }

    public String getContactlessTransLimit() {
        return contactlessTransLimit;
    }

    public void setContactlessTransLimit(String contactlessTransLimit) {
        this.contactlessTransLimit = contactlessTransLimit;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTransLimitODCVM() {
        return transLimitODCVM;
    }

    public void setTransLimitODCVM(String transLimitODCVM) {
        this.transLimitODCVM = transLimitODCVM;
    }

    public String getTtq() {
        return ttq;
    }

    public void setTtq(String ttq) {
        this.ttq = ttq;
    }

    public String getUDOL1() {
        return uDOL1;
    }

    public void setUDOL1(String uDOL1) {
        this.uDOL1 = uDOL1;
    }

    public String getUDOL2() {
        return uDOL2;
    }

    public void setUDOL2(String uDOL2) {
        this.uDOL2 = uDOL2;
    }

    public String getUDOL3() {
        return uDOL3;
    }

    public void setUDOL3(String uDOL3) {
        this.uDOL3 = uDOL3;
    }

    public String getUDOL4() {
        return uDOL4;
    }

    public void setUDOL4(String uDOL4) {
        this.uDOL4 = uDOL4;
    }

    public String getUDolLen() {
        return uDolLen;
    }

    public void setUDolLen(String uDolLen) {
        this.uDolLen = uDolLen;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getZeroAmtCheckOpt() {
        return zeroAmtCheckOpt;
    }

    public void setZeroAmtCheckOpt(String zeroAmtCheckOpt) {
        this.zeroAmtCheckOpt = zeroAmtCheckOpt;
    }

    public String getAddTagsLen() {
        return addTagsLen;
    }

    public void setAddTagsLen(String addTagsLen) {
        this.addTagsLen = addTagsLen;
    }

    @Override
    public String tagPrefix() {
        return contactLessAidTag;
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
        contactLessAidTag = prefix;
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
        AidEntity aidEntity = new AidEntity();
        int aidLength;
        try {
            aidLength = com.dps.pos.payment.utils.ConvertUtils.bcdStringToInt(this.aidLength);
        } catch (Exception e) {
            throw new BcdConvertException(String.valueOf(this.aidLength), R.string.invalid_aid_length);
        }
        String aid = org.apache.commons.lang3.StringUtils.substring(this.aid, 0, aidLength*2);
        // TODO: 4/19/2025 check if asi value correct 
        int asi = 0;
        String tacDefault = this.tacDefault;
        String tacDenial = this.tacDenial;
        String tacOnline = this.tacOnline;
        String appVersion = this.version;
        // AH - TODO: 5/18/2025 handle null values
//        int ddolLength = 0;
//        try {
//            ddolLength = ConvertUtils.bcdStringToInt(this.dDolLen);
//        } catch (Exception e) {
//            throw new BcdConvertException(String.valueOf(this.dDolLen),R.string.invalid_ddol_length);
//        }
//        String ddol = org.apache.commons.lang3.StringUtils.substring(this.dDOL1, 0, ddolLength);
        long threshold = 0;
        int maxTargetPercent = 0;
        int targetPercent = 0;
        int onlinePinCap = 1;
        // TODO: 4/19/2025 should we get this from terminal or from tms aidCtls json
        long transLimit = 0;
        try {
            transLimit = ConvertUtils.bcdStringToLong(this.transLimit);
        } catch (Exception e) {
            throw new BcdConvertException(String.valueOf(this.transLimit), R.string.invalid_transLimit);
        }
        long contactlessCvmLimit = 0;
        try {
            contactlessCvmLimit = ConvertUtils.bcdStringToLong(this.cvmLimit);
        } catch (Exception e) {
            throw new BcdConvertException(String.valueOf(this.cvmLimit), R.string.invalid_cvm_limit);
        }
        long contactlessTransLimit = 0;
        try {
            contactlessTransLimit = ConvertUtils.bcdStringToLong(this.contactlessTransLimit);
        } catch (Exception e) {
            throw new BcdConvertException(String.valueOf(this.contactlessTransLimit), R.string.invalid_contactless_trans_limit);
        }
        long contactlessFloorLimit = 0;
        try {
            contactlessFloorLimit = com.dps.pos.payment.utils.ConvertUtils.hexStringToLong(this.floorLimit);
        } catch (Exception e) {
            throw new BcdConvertException(String.valueOf(this.floorLimit), R.string.invalid_floor_limit);
        }
        long floorLimit = 0;
        AidEntryModeEnum aidEntryModeEnum = AidEntryModeEnum.AID_ENTRY_CONTACTLESS;


        aidEntity.setAid(aid);
        aidEntity.setAsi(asi);
        aidEntity.setTacDefault(tacDefault);
        aidEntity.setTacOnline(tacOnline);
        aidEntity.setTacDenial(tacDenial);
        aidEntity.setAppVerNum(appVersion);
//        aidEntity.setDdol(ddol);
        aidEntity.setThreshold(threshold);
        aidEntity.setMaxTargetPercent(maxTargetPercent);
        aidEntity.setTargetPercent(targetPercent);
        aidEntity.setOnlinePinCap(onlinePinCap);
        aidEntity.setContactlessCvmLimit(contactlessCvmLimit);
        aidEntity.setContactlessTransLimit(contactlessTransLimit);
        aidEntity.setContactlessFloorLimit(contactlessFloorLimit);
        aidEntity.setFloorLimit(floorLimit);
        aidEntity.setTransLimit(transLimit);
        aidEntity.setAidEntryModeEnum(aidEntryModeEnum);
        return aidEntity;
    }

    @Override
    public List<TagValue> toTagValue() {
        return ReflectUtils.getTagValues(this);
    }
}

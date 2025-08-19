package com.dps.pos.payment.apex.tms.model;

import androidx.annotation.NonNull;
import androidx.room.*;

import com.big0soft.utils.ConvertUtils;
import com.dps.pos.payment.R;
import com.dps.pos.payment.apex.tms.Mapping2TagValue;
import com.dps.pos.payment.dpsandroid.database.AppDatabase;
import com.dps.pos.payment.exception.HexConvertException;
import com.dps.pos.payment.nexgo.mapper.MappableToCapkEntity;
import com.dps.pos.payment.utils.ReflectUtils;
import com.google.gson.annotations.SerializedName;
import com.nexgo.oaf.apiv3.emv.CapkEntity;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Room entity for CAPK (Certification Authority Public Key) data
 * Table name: capk
 */
@Entity(tableName = AppDatabase.RoomConstants.CAPK_LIST_TABLE_NAME,
        foreignKeys = @ForeignKey(
                entity = TerminalApex.class,
                parentColumns = "record_id",
                childColumns = "terminal_id",
                onDelete = ForeignKey.CASCADE
        ),
        indices = {@Index("terminal_id")})
//Terminal1.CapkList1.Capk1
public class CapkListApex implements Serializable, TmsTagInfo, MappableToCapkEntity, TmsRecordValidation, Mapping2TagValue {
    private static final long serialVersionUID = -4582340239647312421L;
    @SerializedName("Terminal1.record_id")
    @ColumnInfo(name = "terminal_id")
    private String terminalId;
    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;
    /*
     * apex doc
     * type hex
     * length 1
     */
    @SerializedName("ArithInd")
    @ColumnInfo(name = "ArithInd")
    private String arithInd;
    /**
     * apex doc
     * type hex
     * length 20
     */
    @SerializedName("CheckSum")
    @ColumnInfo(name = "CheckSum")
    private String checkSum;
    /**
     * apex doc
     * type bcd
     * length 3
     */
    @SerializedName("ExpDate")
    @ColumnInfo(name = "ExpDate")
    private String expDate;
    /**
     * apex doc
     * type hex
     * length 3
     */
    @SerializedName("Exponent")
    @ColumnInfo(name = "Exponent")
    private String exponent;
    /**
     * apex doc
     * type hex
     * length 1
     */
    @SerializedName("ExponentLen")
    @ColumnInfo(name = "ExponentLen")
    private String exponentLen;
    //    @SerializedName("HashAlgorithm")
    @SerializedName("HashInd")
    @ColumnInfo(name = "HashInd")
    private String hashInd;

    /**
     * apex doc
     * type hex
     * length 1
     */
    @SerializedName("KeyID")
    @ColumnInfo(name = "KeyID")
    private String keyId;

    /**
     * apex doc
     * type hex
     * length 32
     */
    @SerializedName("Modul1")
    @ColumnInfo(name = "Modul1")
    private String modul1;
    /**
     * apex doc
     * type hex
     * length 32
     */
    @SerializedName("Modul2")
    @ColumnInfo(name = "Modul2")
    private String modul2;
    /**
     * apex doc
     * type hex
     * length 32
     */
    @SerializedName("Modul3")
    @ColumnInfo(name = "Modul3")
    private String modul3;
    /**
     * apex doc
     * type hex
     * length 32
     */
    @SerializedName("Modul4")
    @ColumnInfo(name = "Modul4")
    private String modul4;
    /**
     * apex doc
     * type hex
     * length 32
     */
    @SerializedName("Modul5")
    @ColumnInfo(name = "Modul5")
    private String modul5;
    /**
     * apex doc
     * type hex
     * length 32
     */
    @SerializedName("Modul6")
    @ColumnInfo(name = "Modul6")
    private String modul6;
    /**
     * apex doc
     * type hex
     * length 32
     */
    @SerializedName("Modul7")
    @ColumnInfo(name = "Modul7")
    private String modul7;
    /**
     * apex doc
     * type hex
     * length 24
     */
    @SerializedName("Modul8")
    @ColumnInfo(name = "Modul8")
    private String modul8;
    /**
     * apex doc
     * type hex
     * length 1
     */
    @SerializedName("ModulLen")
    @ColumnInfo(name = "ModulLen")
    private String modulLen;


    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    private String recordName;

    /**
     * apex doc
     * type hex
     * length 5
     */
    @SerializedName("Rid")
    @ColumnInfo(name = "Rid")
    private String rid;

    private String cApkTag;

    public String getArithInd() {
        return arithInd;
    }

    public void setArithInd(String arithInd) {
        this.arithInd = arithInd;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getExponent() {
        return exponent;
    }

    public void setExponent(String exponent) {
        this.exponent = exponent;
    }

    public String getExponentLen() {
        return exponentLen;
    }

    public void setExponentLen(String exponentLen) {
        this.exponentLen = exponentLen;
    }

    public String getHashInd() {
        return hashInd;
    }

    public void setHashInd(String hashInd) {
        this.hashInd = hashInd;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getRecordName() {
        return recordName;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getCApkTag() {
        return cApkTag;
    }

    public void setCApkTag(String cApkTag) {
        this.cApkTag = cApkTag;
    }

    @Override
    public String toString() {
        return "CapkListApex{" +
               "arithInd='" + arithInd + '\'' +
               ", checkSum='" + checkSum + '\'' +
               ", expDate='" + expDate + '\'' +
               ", exponent='" + exponent + '\'' +
               ", exponentLen='" + exponentLen + '\'' +
               ", hashInd='" + hashInd + '\'' +
               ", keyId='" + keyId + '\'' +
               ", modul1='" + modul1 + '\'' +
               ", modul2='" + modul2 + '\'' +
               ", modul3='" + modul3 + '\'' +
               ", modul4='" + modul4 + '\'' +
               ", modul5='" + modul5 + '\'' +
               ", modul6='" + modul6 + '\'' +
               ", modul7='" + modul7 + '\'' +
               ", modul8='" + modul8 + '\'' +
               ", modulLen='" + modulLen + '\'' +
               ", recordId='" + recordId + '\'' +
               ", recordName='" + recordName + '\'' +
               ", rid='" + rid + '\'' +
               ", cApkTag='" + cApkTag + '\'' +
               '}';
    }

    public String getModul1() {
        return modul1;
    }


    public String getModul2() {
        return modul2;
    }


    public String getModul3() {
        return modul3;
    }


    public String getModul4() {
        return modul4;
    }


    public String getModul5() {
        return modul5;
    }


    public String getModul6() {
        return modul6;
    }


    public String getModul7() {
        return modul7;
    }


    public String getModul8() {
        return modul8;
    }


    public String getModulLen() {
        return modulLen;
    }


    public String getRecordId() {
        return recordId;
    }


    public void setModul1(String modul1) {
        this.modul1 = modul1;
    }

    public void setModul2(String modul2) {
        this.modul2 = modul2;
    }

    public void setModul3(String modul3) {
        this.modul3 = modul3;
    }

    public void setModul4(String modul4) {
        this.modul4 = modul4;
    }

    public void setModul5(String modul5) {
        this.modul5 = modul5;
    }

    public void setModul6(String modul6) {
        this.modul6 = modul6;
    }

    public void setModul7(String modul7) {
        this.modul7 = modul7;
    }

    public void setModul8(String modul8) {
        this.modul8 = modul8;
    }

    public void setModulLen(String modulLen) {
        this.modulLen = modulLen;
    }


    public void setcApkTag(String cApkTag) {
        this.cApkTag = cApkTag;
    }


    @Override
    public String tagPrefix() {
        return cApkTag;
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
        cApkTag = prefix;
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
    public CapkEntity toCapkEntity() {
        CapkEntity capkEntity = new CapkEntity();
        int capkIdx = 0;
        try {
            capkIdx = ConvertUtils.hexString2Int(keyId);
        } catch (Exception e) {
            throw new HexConvertException(keyId, R.string.invalid_key_id);
        }

        int moduleLen = 0;
        try {
            moduleLen = ConvertUtils.hexString2Int(modulLen);
        } catch (Exception e) {
            throw new HexConvertException(modulLen, R.string.invalid_modulus_len);
        }
        String modules = String.join("", modul1, modul2, modul3, modul4, modul5, modul6, modul7, modul8);
        modules = StringUtils.substring(modules, 0, (moduleLen * 2));

        int hashInd = 0;
        try {
            hashInd = ConvertUtils.hexString2Int(this.hashInd);
        } catch (Exception e) {
            throw new HexConvertException(this.hashInd, R.string.invalid_hash_algorithm);
        }
        int arithInd = Integer.parseInt(this.arithInd);

        int exponentLen = 0;
        try {
            exponentLen = ConvertUtils.hexString2Int(this.exponentLen);
        } catch (Exception e) {
            throw new HexConvertException(this.exponentLen, R.string.invalid_exponent_len);
        }


        String exponent = StringUtils.substring(this.exponent, 0, (exponentLen * 2));

        capkEntity.setRid(rid);
        capkEntity.setCapkIdx(capkIdx);
        capkEntity.setHashInd(hashInd);
        capkEntity.setArithInd(arithInd);
        capkEntity.setModulus(modules);
        capkEntity.setExponent(exponent);
        capkEntity.setCheckSum(checkSum);
        capkEntity.setExpireDate(expDate);

        return capkEntity;
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

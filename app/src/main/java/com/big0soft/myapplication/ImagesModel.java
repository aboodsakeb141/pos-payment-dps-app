package com.dps.pos.payment.apex.tms.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.big0soft.utils.ImageUtils;
import com.big0soft.utils.StringUtils;
import com.dps.pos.payment.apex.tms.Mapping2TagValue;
import com.dps.pos.payment.apex.tms.MappingIdleImage;
import com.dps.pos.payment.dpsandroid.database.AppDatabase;
import com.dps.pos.payment.dpsandroid.model.IdleImage;
import com.dps.pos.payment.utils.LogUtils;
import com.dps.pos.payment.utils.ReflectUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Room entity for Images Model data
 * Table name: images_model
 */
@Entity(tableName = AppDatabase.RoomConstants.IMAGES_MODEL_TABLE_NAME,
        foreignKeys = @ForeignKey(
                entity = TerminalApex.class,
                parentColumns = "record_id",
                childColumns = "terminal_id",
                onDelete = ForeignKey.CASCADE
        ),
        indices = {@Index("terminal_id")})
public class ImagesModel implements TmsTagInfo, Serializable, TmsRecordValidation, MappingIdleImage , Mapping2TagValue {
    private static final long serialVersionUID = 6529685098367767690L;
    @SerializedName("Terminal1.record_id")
    @ColumnInfo(name = "terminal_id")
    private String terminalId;
    @SerializedName("ReceiptArabicTransactionApproved")
    @ColumnInfo(name = "ReceiptArabicTransactionApproved")
    private String ReceiptArabicTransactionApproved; // Base64-encoded BMP image
    @SerializedName("ReceiptArabicTransactionDeclined")
    @ColumnInfo(name = "ReceiptArabicTransactionDeclined")
    private String ReceiptArabicTransactionDeclined; // Base64-encoded BMP image
    @SerializedName("ReceiptHeader1")
    @ColumnInfo(name = "ReceiptHeader1")
    private String ReceiptHeader1; // Base64-encoded BMP image
    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;
    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    private String recordName;
    @SerializedName("ScreenImage1")
    @ColumnInfo(name = "ScreenImage1")
    private String ScreenImage1; // Base64-encoded JPEG image
    @SerializedName("ScreenImage2")
    @ColumnInfo(name = "ScreenImage2")
    private String ScreenImage2; // Base64-encoded PNG image
    @SerializedName("ScreenImage3")
    @ColumnInfo(name = "ScreenImage3")
    private String ScreenImage3; // Base64-encoded PNG image
    @SerializedName("ScreenImage4")
    @ColumnInfo(name = "ScreenImage4")
    private String ScreenImage4; // Base64-encoded image (empty in JSON)
    @SerializedName("ScreenImage5")
    @ColumnInfo(name = "ScreenImage5")
    private String ScreenImage5; // Base64-encoded image (empty in JSON)
    @SerializedName("ScreenImage6")
    @ColumnInfo(name = "ScreenImage6")
    private String ScreenImage6; // Base64-encoded image (empty in JSON)
    @SerializedName("ScreenImage7")
    @ColumnInfo(name = "ScreenImage7")
    private String ScreenImage7; // Base64-encoded image (empty in JSON)
    @SerializedName("ScreenImage8")
    @ColumnInfo(name = "ScreenImage8")
    private String ScreenImage8; // Base64-encoded image (empty in JSON)
    @SerializedName("ScreenImage9")
    @ColumnInfo(name = "ScreenImage9")
    private String ScreenImage9; // Base64-encoded image (empty in JSON)


    @NonNull
    @Override
    public String toString() {
        return "ImagesModel{" +
               "ReceiptArabicTransactionApproved=" + ReceiptArabicTransactionApproved +
               ", ReceiptArabicTransactionDeclined=" + ReceiptArabicTransactionDeclined +
               ", ReceiptHeader1=" + ReceiptHeader1 +
               ", record_id='" + recordId + '\'' +
               ", record_name='" + recordName + '\'' +
               ", ScreenImage1=" + ScreenImage1 +
               ", ScreenImage2=" + ScreenImage2 +
               ", ScreenImage3=" + ScreenImage3 +
               ", ScreenImage4=" + ScreenImage4 +
               ", ScreenImage5=" + ScreenImage5 +
               ", ScreenImage6=" + ScreenImage6 +
               ", ScreenImage7=" + ScreenImage7 +
               ", ScreenImage8=" + ScreenImage8 +
               ", ScreenImage9=" + ScreenImage9 +
               '}';
    }

    public String getReceiptArabicTransactionApproved() {
        return ReceiptArabicTransactionApproved;
    }

    public void setReceiptArabicTransactionApproved(String receiptArabicTransactionApproved) {
        ReceiptArabicTransactionApproved = receiptArabicTransactionApproved;
    }

    public String getReceiptArabicTransactionDeclined() {
        return ReceiptArabicTransactionDeclined;
    }

    public void setReceiptArabicTransactionDeclined(String receiptArabicTransactionDeclined) {
        ReceiptArabicTransactionDeclined = receiptArabicTransactionDeclined;
    }

    public String getReceiptHeader1() {
        return ReceiptHeader1;
    }

    public void setReceiptHeader1(String receiptHeader1) {
        ReceiptHeader1 = receiptHeader1;
    }

    public String getRecordId() {
        return recordId;
    }


    public String getRecordName() {
        return recordName;
    }


    public String getScreenImage1() {
        return ScreenImage1;
    }

    public void setScreenImage1(String screenImage1) {
        ScreenImage1 = screenImage1;
    }

    public String getScreenImage2() {
        return ScreenImage2;
    }

    public void setScreenImage2(String screenImage2) {
        ScreenImage2 = screenImage2;
    }

    public String getScreenImage3() {
        return ScreenImage3;
    }

    public void setScreenImage3(String screenImage3) {
        ScreenImage3 = screenImage3;
    }

    public String getScreenImage4() {
        return ScreenImage4;
    }

    public void setScreenImage4(String screenImage4) {
        ScreenImage4 = screenImage4;
    }

    public String getScreenImage5() {
        return ScreenImage5;
    }

    public void setScreenImage5(String screenImage5) {
        ScreenImage5 = screenImage5;
    }

    public String getScreenImage6() {
        return ScreenImage6;
    }

    public void setScreenImage6(String screenImage6) {
        ScreenImage6 = screenImage6;
    }

    public String getScreenImage7() {
        return ScreenImage7;
    }

    public void setScreenImage7(String screenImage7) {
        ScreenImage7 = screenImage7;
    }

    public String getScreenImage8() {
        return ScreenImage8;
    }

    public void setScreenImage8(String screenImage8) {
        ScreenImage8 = screenImage8;
    }

    public String getScreenImage9() {
        return ScreenImage9;
    }

    public void setScreenImage9(String screenImage9) {
        ScreenImage9 = screenImage9;
    }

    @Override
    public boolean isValid() {
        return !StringUtils.isEmpty(recordId);
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
    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
    @Override
    public List<IdleImage> toIdleImage() {
        List<IdleImage> idleImages = new ArrayList<>();
        if (!StringUtils.isEmpty(ScreenImage1)) {
            idleImages.add(new IdleImage(1, ImageUtils.base64ToBitmap(ScreenImage1)));
        }
        if (!StringUtils.isEmpty(ScreenImage2)) {
            idleImages.add(new IdleImage(2, ImageUtils.base64ToBitmap(ScreenImage2)));
        }
        if (!StringUtils.isEmpty(ScreenImage3)) {
            idleImages.add(new IdleImage(3, ImageUtils.base64ToBitmap(ScreenImage3)));
        }
        if (!StringUtils.isEmpty(ScreenImage4)) {
            idleImages.add(new IdleImage(4, ImageUtils.base64ToBitmap(ScreenImage4)));
        }
        if (!StringUtils.isEmpty(ScreenImage5)) {
            idleImages.add(new IdleImage(5, ImageUtils.base64ToBitmap(ScreenImage5)));
        }
        if (!StringUtils.isEmpty(ScreenImage6)) {
            idleImages.add(new IdleImage(6, ImageUtils.base64ToBitmap(ScreenImage6)));
        }
        if (!StringUtils.isEmpty(ScreenImage7)) {
            idleImages.add(new IdleImage(7, ImageUtils.base64ToBitmap(ScreenImage7)));
        }
        if (!StringUtils.isEmpty(ScreenImage8)) {
            idleImages.add(new IdleImage(8, ImageUtils.base64ToBitmap(ScreenImage8)));
        }
        if (!StringUtils.isEmpty(ScreenImage9)) {
            idleImages.add(new IdleImage(9, ImageUtils.base64ToBitmap(ScreenImage9)));
        }
        LogUtils.i("ImagesModel", "idleImages: " + idleImages.size());
        return idleImages;
    }

    @Override
    public List<TagValue> toTagValue() {
        return ReflectUtils.getTagValues(this);
    }
}

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
 * Room entity for Idle Buttons data
 * Table name: idle_button
 */
@Entity(tableName = AppDatabase.RoomConstants.IDLE_BUTTONS_TABLE_NAME,
        foreignKeys = @ForeignKey(
                entity = TerminalApex.class,
                parentColumns = "record_id",
                childColumns = "terminal_id",
                onDelete = ForeignKey.CASCADE
        ),
        indices = {@Index("terminal_id")})
public class IdleButtons implements TmsTagInfo, Serializable, TmsRecordValidation, Mapping2TagValue {
    private static final long serialVersionUID = 2669293150219020349L;
    @SerializedName("Terminal1.record_id")
    @ColumnInfo(name = "terminal_id")
    private String terminalId;
    @SerializedName("btnAmount1")
    @ColumnInfo(name = "btnAmount1")
    private String btnAmount1;
    @SerializedName("btnAmount2")
    @ColumnInfo(name = "btnAmount2")
    private String btnAmount2;
    @SerializedName("btnAmount3")
    @ColumnInfo(name = "btnAmount3")
    private String btnAmount3;
    @SerializedName("btnAmount4")
    @ColumnInfo(name = "btnAmount4")
    private String btnAmount4;
    @SerializedName("btnAmount5")
    @ColumnInfo(name = "btnAmount5")
    private String btnAmount5;
    @SerializedName("btnAmount6")
    @ColumnInfo(name = "btnAmount6")
    private String btnAmount6;
    @SerializedName("btnAmount7")
    @ColumnInfo(name = "btnAmount7")
    private String btnAmount7;
    @SerializedName("btnAmount8")
    @ColumnInfo(name = "btnAmount8")
    private String btnAmount8;
    @SerializedName("btnAmount9")
    @ColumnInfo(name = "btnAmount9")
    private String btnAmount9;

    @SerializedName("btnArText1")
    @ColumnInfo(name = "btnArText1")
    @TLVOptions(paddingLength = 15)
    private String btnArText1;
    @SerializedName("btnArText2")
    @ColumnInfo(name = "btnArText2")
    @TLVOptions(paddingLength = 15)
    private String btnArText2;
    @SerializedName("btnArText3")
    @ColumnInfo(name = "btnArText3")
    @TLVOptions(paddingLength = 15)
    private String btnArText3;
    @SerializedName("btnArText4")
    @ColumnInfo(name = "btnArText4")
    @TLVOptions(paddingLength = 15)
    private String btnArText4;
    @SerializedName("btnArText5")
    @ColumnInfo(name = "btnArText5")
    @TLVOptions(paddingLength = 15)
    private String btnArText5;
    @SerializedName("btnArText6")
    @ColumnInfo(name = "btnArText6")
    @TLVOptions(paddingLength = 15)
    private String btnArText6;
    @SerializedName("btnArText7")
    @ColumnInfo(name = "btnArText7")
    @TLVOptions(paddingLength = 15)
    private String btnArText7;
    @SerializedName("btnArText8")
    @ColumnInfo(name = "btnArText8")
    @TLVOptions(paddingLength = 15)
    private String btnArText8;
    @SerializedName("btnArText9")
    @ColumnInfo(name = "btnArText9")
    @TLVOptions(paddingLength = 15)
    private String btnArText9;
    @TLVOptions(paddingLength = 15)

    @SerializedName("btnEnText1")
    @ColumnInfo(name = "btnEnText1")
    private String btnEnText1;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnEnText2")
    @ColumnInfo(name = "btnEnText2")
    private String btnEnText2;
    @SerializedName("btnEnText3")
    @ColumnInfo(name = "btnEnText3")
    @TLVOptions(paddingLength = 15)
    private String btnEnText3;
    @SerializedName("btnEnText4")
    @ColumnInfo(name = "btnEnText4")
    @TLVOptions(paddingLength = 15)
    private String btnEnText4;
    @SerializedName("btnEnText5")
    @ColumnInfo(name = "btnEnText5")
    @TLVOptions(paddingLength = 15)
    private String btnEnText5;
    @SerializedName("btnEnText6")
    @ColumnInfo(name = "btnEnText6")
    @TLVOptions(paddingLength = 15)
    private String btnEnText6;
    @SerializedName("btnEnText7")
    @ColumnInfo(name = "btnEnText7")
    @TLVOptions(paddingLength = 15)
    private String btnEnText7;
    @SerializedName("btnEnText8")
    @ColumnInfo(name = "btnEnText8")
    @TLVOptions(paddingLength = 15)
    private String btnEnText8;
    @SerializedName("btnEnText9")
    @ColumnInfo(name = "btnEnText9")
    @TLVOptions(paddingLength = 15)
    private String btnEnText9;

    @SerializedName("btnIcon1")
    @TLVOptions(paddingLength = 15)
    @ColumnInfo(name = "btnIcon1")
    private String btnIcon1;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnIcon2")
    @ColumnInfo(name = "btnIcon2")
    private String btnIcon2;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnIcon3")
    @ColumnInfo(name = "btnIcon3")
    private String btnIcon3;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnIcon4")
    @ColumnInfo(name = "btnIcon4")
    private String btnIcon4;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnIcon5")
    @ColumnInfo(name = "btnIcon5")
    private String btnIcon5;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnIcon6")
    @ColumnInfo(name = "btnIcon6")
    private String btnIcon6;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnIcon7")
    @ColumnInfo(name = "btnIcon7")
    private String btnIcon7;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnIcon8")
    @ColumnInfo(name = "btnIcon8")
    private String btnIcon8;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnIcon9")
    @ColumnInfo(name = "btnIcon9")
    private String btnIcon9;
    @TLVOptions(paddingLength = 15)

    @SerializedName("btnId1")
    @ColumnInfo(name = "btnId1")
    private String btnId1;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnId2")
    @ColumnInfo(name = "btnId2")
    private String btnId2;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnId3")
    @ColumnInfo(name = "btnId3")
    private String btnId3;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnId4")
    @ColumnInfo(name = "btnId4")
    private String btnId4;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnId5")
    @ColumnInfo(name = "btnId5")
    private String btnId5;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnId6")
    @ColumnInfo(name = "btnId6")
    private String btnId6;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnId7")
    @ColumnInfo(name = "btnId7")
    private String btnId7;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnId8")
    @ColumnInfo(name = "btnId8")
    private String btnId8;
    @TLVOptions(paddingLength = 15)
    @SerializedName("btnId9")
    @ColumnInfo(name = "btnId9")
    private String btnId9;
    @TLVOptions(paddingLength = 15)
    @SerializedName("DonationTitleImage")
    @ColumnInfo(name = "DonationTitleImage")
    private String DonationTitleImage;
    @SerializedName("enableDonationHomeScreen")
    @ColumnInfo(name = "enableDonationHomeScreen")
    private boolean enableDonationHomeScreen;
    @SerializedName("packageName1")
    @ColumnInfo(name = "packageName1")
    private String packageName1;
    @SerializedName("packageName2")
    @ColumnInfo(name = "packageName2")
    private String packageName2;
    @SerializedName("packageName3")
    @ColumnInfo(name = "packageName3")
    private String packageName3;
    @SerializedName("packageName4")
    @ColumnInfo(name = "packageName4")
    private String packageName4;
    @SerializedName("packageName5")
    @ColumnInfo(name = "packageName5")
    private String packageName5;
    @SerializedName("packageName6")
    @ColumnInfo(name = "packageName6")
    private String packageName6;
    @SerializedName("packageName7")
    @ColumnInfo(name = "packageName7")
    private String packageName7;
    @SerializedName("packageName8")
    @ColumnInfo(name = "packageName8")
    private String packageName8;
    @SerializedName("packageName9")
    @ColumnInfo(name = "packageName9")
    private String packageName9;
    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;
    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    private String recordName;

    @NonNull
    @Override
    public String toString() {
        return "IdleImages{" +
                "btnAmount1='" + btnAmount1 + '\'' +
                ", btnAmount2='" + btnAmount2 + '\'' +
                ", btnAmount3='" + btnAmount3 + '\'' +
                ", btnAmount4='" + btnAmount4 + '\'' +
                ", btnAmount5='" + btnAmount5 + '\'' +
                ", btnAmount6='" + btnAmount6 + '\'' +
                ", btnAmount7='" + btnAmount7 + '\'' +
                ", btnAmount8='" + btnAmount8 + '\'' +
                ", btnAmount9='" + btnAmount9 + '\'' +
                ", btnArText1='" + btnArText1 + '\'' +
                ", btnArText2='" + btnArText2 + '\'' +
                ", btnArText3='" + btnArText3 + '\'' +
                ", btnArText4='" + btnArText4 + '\'' +
                ", btnArText5='" + btnArText5 + '\'' +
                ", btnArText6='" + btnArText6 + '\'' +
                ", btnArText7='" + btnArText7 + '\'' +
                ", btnArText8='" + btnArText8 + '\'' +
                ", btnArText9='" + btnArText9 + '\'' +
                ", btnEnText1='" + btnEnText1 + '\'' +
                ", btnEnText2='" + btnEnText2 + '\'' +
                ", btnEnText3='" + btnEnText3 + '\'' +
                ", btnEnText4='" + btnEnText4 + '\'' +
                ", btnEnText5='" + btnEnText5 + '\'' +
                ", btnEnText6='" + btnEnText6 + '\'' +
                ", btnEnText7='" + btnEnText7 + '\'' +
                ", btnEnText8='" + btnEnText8 + '\'' +
                ", btnEnText9='" + btnEnText9 + '\'' +
                ", btnIcon1='" + btnIcon1 + '\'' +
                ", btnIcon2='" + btnIcon2 + '\'' +
                ", btnIcon3='" + btnIcon3 + '\'' +
                ", btnIcon4='" + btnIcon4 + '\'' +
                ", btnIcon5='" + btnIcon5 + '\'' +
                ", btnIcon6='" + btnIcon6 + '\'' +
                ", btnIcon7='" + btnIcon7 + '\'' +
                ", btnIcon8='" + btnIcon8 + '\'' +
                ", btnIcon9='" + btnIcon9 + '\'' +
                ", btnId1='" + btnId1 + '\'' +
                ", btnId2='" + btnId2 + '\'' +
                ", btnId3='" + btnId3 + '\'' +
                ", btnId4='" + btnId4 + '\'' +
                ", btnId5='" + btnId5 + '\'' +
                ", btnId6='" + btnId6 + '\'' +
                ", btnId7='" + btnId7 + '\'' +
                ", btnId8='" + btnId8 + '\'' +
                ", btnId9='" + btnId9 + '\'' +
                ", DonationTitleImage='" + DonationTitleImage + '\'' +
                ", enableDonationHomeScreen='" + enableDonationHomeScreen + '\'' +
                ", packageName1='" + packageName1 + '\'' +
                ", packageName2='" + packageName2 + '\'' +
                ", packageName3='" + packageName3 + '\'' +
                ", packageName4='" + packageName4 + '\'' +
                ", packageName5='" + packageName5 + '\'' +
                ", packageName6='" + packageName6 + '\'' +
                ", packageName7='" + packageName7 + '\'' +
                ", packageName8='" + packageName8 + '\'' +
                ", packageName9='" + packageName9 + '\'' +
                ", record_id='" + recordId + '\'' +
                ", record_name='" + recordName + '\'' +
                '}';
    }

    @NonNull
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

    public String getBtnAmount1() {
        return btnAmount1;
    }

    public void setBtnAmount1(String btnAmount1) {
        this.btnAmount1 = btnAmount1;
    }

    public String getBtnAmount2() {
        return btnAmount2;
    }

    public void setBtnAmount2(String btnAmount2) {
        this.btnAmount2 = btnAmount2;
    }

    public String getBtnAmount3() {
        return btnAmount3;
    }

    public void setBtnAmount3(String btnAmount3) {
        this.btnAmount3 = btnAmount3;
    }

    public String getBtnAmount4() {
        return btnAmount4;
    }

    public void setBtnAmount4(String btnAmount4) {
        this.btnAmount4 = btnAmount4;
    }

    public String getBtnAmount5() {
        return btnAmount5;
    }

    public void setBtnAmount5(String btnAmount5) {
        this.btnAmount5 = btnAmount5;
    }

    public String getBtnAmount6() {
        return btnAmount6;
    }

    public void setBtnAmount6(String btnAmount6) {
        this.btnAmount6 = btnAmount6;
    }

    public String getBtnAmount7() {
        return btnAmount7;
    }

    public void setBtnAmount7(String btnAmount7) {
        this.btnAmount7 = btnAmount7;
    }

    public String getBtnAmount8() {
        return btnAmount8;
    }

    public void setBtnAmount8(String btnAmount8) {
        this.btnAmount8 = btnAmount8;
    }

    public String getBtnAmount9() {
        return btnAmount9;
    }

    public void setBtnAmount9(String btnAmount9) {
        this.btnAmount9 = btnAmount9;
    }

    public String getBtnArText1() {
        return btnArText1;
    }

    public void setBtnArText1(String btnArText1) {
        this.btnArText1 = btnArText1;
    }

    public String getBtnArText2() {
        return btnArText2;
    }

    public void setBtnArText2(String btnArText2) {
        this.btnArText2 = btnArText2;
    }

    public String getBtnArText3() {
        return btnArText3;
    }

    public void setBtnArText3(String btnArText3) {
        this.btnArText3 = btnArText3;
    }

    public String getBtnArText4() {
        return btnArText4;
    }

    public void setBtnArText4(String btnArText4) {
        this.btnArText4 = btnArText4;
    }

    public String getBtnArText5() {
        return btnArText5;
    }

    public void setBtnArText5(String btnArText5) {
        this.btnArText5 = btnArText5;
    }

    public String getBtnArText6() {
        return btnArText6;
    }

    public void setBtnArText6(String btnArText6) {
        this.btnArText6 = btnArText6;
    }

    public String getBtnArText7() {
        return btnArText7;
    }

    public void setBtnArText7(String btnArText7) {
        this.btnArText7 = btnArText7;
    }

    public String getBtnArText8() {
        return btnArText8;
    }

    public void setBtnArText8(String btnArText8) {
        this.btnArText8 = btnArText8;
    }

    public String getBtnArText9() {
        return btnArText9;
    }

    public void setBtnArText9(String btnArText9) {
        this.btnArText9 = btnArText9;
    }

    public String getBtnEnText1() {
        return btnEnText1;
    }

    public void setBtnEnText1(String btnEnText1) {
        this.btnEnText1 = btnEnText1;
    }

    public String getBtnEnText2() {
        return btnEnText2;
    }

    public void setBtnEnText2(String btnEnText2) {
        this.btnEnText2 = btnEnText2;
    }

    public String getBtnEnText3() {
        return btnEnText3;
    }

    public void setBtnEnText3(String btnEnText3) {
        this.btnEnText3 = btnEnText3;
    }

    public String getBtnEnText4() {
        return btnEnText4;
    }

    public void setBtnEnText4(String btnEnText4) {
        this.btnEnText4 = btnEnText4;
    }

    public String getBtnEnText5() {
        return btnEnText5;
    }

    public void setBtnEnText5(String btnEnText5) {
        this.btnEnText5 = btnEnText5;
    }

    public String getBtnEnText6() {
        return btnEnText6;
    }

    public void setBtnEnText6(String btnEnText6) {
        this.btnEnText6 = btnEnText6;
    }

    public String getBtnEnText7() {
        return btnEnText7;
    }

    public void setBtnEnText7(String btnEnText7) {
        this.btnEnText7 = btnEnText7;
    }

    public String getBtnEnText8() {
        return btnEnText8;
    }

    public void setBtnEnText8(String btnEnText8) {
        this.btnEnText8 = btnEnText8;
    }

    public String getBtnEnText9() {
        return btnEnText9;
    }

    public void setBtnEnText9(String btnEnText9) {
        this.btnEnText9 = btnEnText9;
    }

    public String getBtnIcon1() {
        return btnIcon1;
    }

    public void setBtnIcon1(String btnIcon1) {
        this.btnIcon1 = btnIcon1;
    }

    public String getBtnIcon2() {
        return btnIcon2;
    }

    public void setBtnIcon2(String btnIcon2) {
        this.btnIcon2 = btnIcon2;
    }

    public String getBtnIcon3() {
        return btnIcon3;
    }

    public void setBtnIcon3(String btnIcon3) {
        this.btnIcon3 = btnIcon3;
    }

    public String getBtnIcon4() {
        return btnIcon4;
    }

    public void setBtnIcon4(String btnIcon4) {
        this.btnIcon4 = btnIcon4;
    }

    public String getBtnIcon5() {
        return btnIcon5;
    }

    public void setBtnIcon5(String btnIcon5) {
        this.btnIcon5 = btnIcon5;
    }

    public String getBtnIcon6() {
        return btnIcon6;
    }

    public void setBtnIcon6(String btnIcon6) {
        this.btnIcon6 = btnIcon6;
    }

    public String getBtnIcon7() {
        return btnIcon7;
    }

    public void setBtnIcon7(String btnIcon7) {
        this.btnIcon7 = btnIcon7;
    }

    public String getBtnIcon8() {
        return btnIcon8;
    }

    public void setBtnIcon8(String btnIcon8) {
        this.btnIcon8 = btnIcon8;
    }

    public String getBtnIcon9() {
        return btnIcon9;
    }

    public void setBtnIcon9(String btnIcon9) {
        this.btnIcon9 = btnIcon9;
    }

    public String getBtnId1() {
        return btnId1;
    }

    public void setBtnId1(String btnId1) {
        this.btnId1 = btnId1;
    }

    public String getBtnId2() {
        return btnId2;
    }

    public void setBtnId2(String btnId2) {
        this.btnId2 = btnId2;
    }

    public String getBtnId3() {
        return btnId3;
    }

    public void setBtnId3(String btnId3) {
        this.btnId3 = btnId3;
    }

    public String getBtnId4() {
        return btnId4;
    }

    public void setBtnId4(String btnId4) {
        this.btnId4 = btnId4;
    }

    public String getBtnId5() {
        return btnId5;
    }

    public void setBtnId5(String btnId5) {
        this.btnId5 = btnId5;
    }

    public String getBtnId6() {
        return btnId6;
    }

    public void setBtnId6(String btnId6) {
        this.btnId6 = btnId6;
    }

    public String getBtnId7() {
        return btnId7;
    }

    public void setBtnId7(String btnId7) {
        this.btnId7 = btnId7;
    }

    public String getBtnId8() {
        return btnId8;
    }

    public void setBtnId8(String btnId8) {
        this.btnId8 = btnId8;
    }

    public String getBtnId9() {
        return btnId9;
    }

    public void setBtnId9(String btnId9) {
        this.btnId9 = btnId9;
    }

    public String getDonationTitleImage() {
        return DonationTitleImage;
    }

    public void setDonationTitleImage(String donationTitleImage) {
        DonationTitleImage = donationTitleImage;
    }

    public boolean isEnableDonationHomeScreen() {
        return enableDonationHomeScreen;
    }

    public void setEnableDonationHomeScreen(boolean enableDonationHomeScreen) {
        this.enableDonationHomeScreen = enableDonationHomeScreen;
    }

    public String getPackageName1() {
        return packageName1;
    }

    public void setPackageName1(String packageName1) {
        this.packageName1 = packageName1;
    }

    public String getPackageName2() {
        return packageName2;
    }

    public void setPackageName2(String packageName2) {
        this.packageName2 = packageName2;
    }

    public String getPackageName3() {
        return packageName3;
    }

    public void setPackageName3(String packageName3) {
        this.packageName3 = packageName3;
    }

    public String getPackageName4() {
        return packageName4;
    }

    public void setPackageName4(String packageName4) {
        this.packageName4 = packageName4;
    }

    public String getPackageName5() {
        return packageName5;
    }

    public void setPackageName5(String packageName5) {
        this.packageName5 = packageName5;
    }

    public String getPackageName6() {
        return packageName6;
    }

    public void setPackageName6(String packageName6) {
        this.packageName6 = packageName6;
    }

    public String getPackageName7() {
        return packageName7;
    }

    public void setPackageName7(String packageName7) {
        this.packageName7 = packageName7;
    }

    public String getPackageName8() {
        return packageName8;
    }

    public void setPackageName8(String packageName8) {
        this.packageName8 = packageName8;
    }

    public String getPackageName9() {
        return packageName9;
    }

    public void setPackageName9(String packageName9) {
        this.packageName9 = packageName9;
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



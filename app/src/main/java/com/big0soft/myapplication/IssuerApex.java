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
 * Room entity for issuer data
 * Table name: issuer (as specified in requirements)
 * Has a foreign key relationship with AcquirerEntity
 */
@Entity(
        tableName = AppDatabase.RoomConstants.ISSUER_TABLE_NAME
        ,
        foreignKeys = {@ForeignKey(
                entity = TerminalApex.class,
                parentColumns = "record_id",
                childColumns = "terminal_id",
                onDelete = ForeignKey.CASCADE
        )},
        indices = {@Index("terminal_id")}
)
//Terminal1.Acquirer1.Issuer1

public class IssuerApex implements Serializable, TmsTagInfo, TmsRecordValidation , Mapping2TagValue {
    private static final long serialVersionUID = 6539685098267767690L;
    @SerializedName("Terminal1.record_id")
    @ColumnInfo(name = "terminal_id")
    private String terminalId;
    @SerializedName("AlwaysSendExpDate")
    @ColumnInfo(name = "AlwaysSendExpDate")
    private boolean alwaysSendExpDate;
    @SerializedName("AmexIssuer")
    @ColumnInfo(name = "AmexIssuer")
    private boolean amexIssuer;
    @SerializedName("BlockAdjust")
    @ColumnInfo(name = "BlockAdjust")
    private boolean blockAdjust;
    @SerializedName("BlockAuthorization")
    @ColumnInfo(name = "BlockAuthorization")
    private boolean blockAuthorization;
    @SerializedName("BlockBalance")
    @ColumnInfo(name = "BlockBalance")
    private boolean blockBalance;
    @SerializedName("BlockCash")
    @ColumnInfo(name = "BlockCash")
    private boolean blockCash;
    @SerializedName("BlockCompletion")
    @ColumnInfo(name = "BlockCompletion")
    private boolean blockCompletion;
    @SerializedName("BlockLoyalty")
    @ColumnInfo(name = "BlockLoyalty")
    private boolean blockLoyalty;
    @SerializedName("BlockManualEntry")
    @ColumnInfo(name = "BlockManualEntry")
    private boolean blockManualEntry;
    @SerializedName("BlockMoto")
    @ColumnInfo(name = "BlockMoto")
    private boolean blockMoto;
    @SerializedName("BlockOfflineSale")
    @ColumnInfo(name = "BlockOfflineSale")
    private boolean blockOfflineSale;
    @SerializedName("BlockRefund")
    @ColumnInfo(name = "BlockRefund")
    private boolean blockRefund;
    @SerializedName("BlockReload")
    @ColumnInfo(name = "BlockReload")
    private boolean blockReload;
    @SerializedName("BlockReloadManualEntry")
    @ColumnInfo(name = "BlockReloadManualEntry")
    private boolean blockReloadManualEntry;
    @SerializedName("BlockSale")
    @ColumnInfo(name = "BlockSale")
    private boolean blockSale;
    @SerializedName("BlockVoid")
    @ColumnInfo(name = "BlockVoid")
    private boolean blockVoid;
    @SerializedName("CashoutMaxAmount")
    @ColumnInfo(name = "CashoutMaxAmount")
    private String cashoutMaxAmount;
    @SerializedName("CheckExpDate")
    @ColumnInfo(name = "CheckExpDate")
    private boolean checkExpDate;
    @SerializedName("CheckServiceCode")
    @ColumnInfo(name = "CheckServiceCode")
    private boolean checkServiceCode;
    @SerializedName("CompletionCeilingPercentage")
    @ColumnInfo(name = "CompletionCeilingPercentage")
    private boolean completionCeilingPercentage;
    @SerializedName("CompletionOffline")
    @ColumnInfo(name = "CompletionOffline")
    private boolean completionOffline;
    @SerializedName("CupIssuer")
    @ColumnInfo(name = "CupIssuer")
    private boolean cupIssuer;
    @SerializedName("DccDisclaimer1")
    @ColumnInfo(name = "DccDisclaimer1")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer1;
    @SerializedName("DccDisclaimer10")
    @ColumnInfo(name = "DccDisclaimer10")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer10;
    @SerializedName("DccDisclaimer2")
    @ColumnInfo(name = "DccDisclaimer2")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer2;
    @SerializedName("DccDisclaimer3")
    @ColumnInfo(name = "DccDisclaimer3")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer3;
    @SerializedName("DccDisclaimer4")
    @ColumnInfo(name = "DccDisclaimer4")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer4;
    @SerializedName("DccDisclaimer5")
    @ColumnInfo(name = "DccDisclaimer5")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer5;
    @SerializedName("DccDisclaimer6")
    @ColumnInfo(name = "DccDisclaimer6")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer6;
    @SerializedName("DccDisclaimer7")
    @ColumnInfo(name = "DccDisclaimer7")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer7;
    @SerializedName("DccDisclaimer8")
    @ColumnInfo(name = "DccDisclaimer8")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer8;
    @SerializedName("DccDisclaimer9")
    @ColumnInfo(name = "DccDisclaimer9")
    @TLVOptions(paddingLength = 40)
    private String dccDisclaimer9;
    @SerializedName("DefaultTransaction")
    @ColumnInfo(name = "DefaultTransaction")
    private String defaultTransaction;
    @SerializedName("EnableCheckMod10")
    @ColumnInfo(name = "EnableCheckMod10")
    private boolean enableCheckMod10;
    @SerializedName("EnableCvv2")
    @ColumnInfo(name = "EnableCvv2")
    private boolean enableCvv2;
    @SerializedName("EnableDcc")
    @ColumnInfo(name = "EnableDcc")
    private boolean enableDcc;
    @SerializedName("EnablePrintDeclinedReceipt")
    @ColumnInfo(name = "EnablePrintDeclinedReceipt")
    private boolean enablePrintDeclinedReceipt;
    @SerializedName("EnablePrintSurcharge")
    @ColumnInfo(name = "EnablePrintSurcharge")
    private boolean enablePrintSurcharge;
    @SerializedName("EnableTipProcessing")
    @ColumnInfo(name = "EnableTipProcessing")
    private boolean enableTipProcessing;
    @SerializedName("ExpiryDateRequired")
    @ColumnInfo(name = "ExpiryDateRequired")
    private boolean expiryDateRequired;
    @SerializedName("FloorLimit")
    @ColumnInfo(name = "FloorLimit")
    private String floorLimit;
    @SerializedName("ForceOnlinePinBelowCtlsCvm")
    @ColumnInfo(name = "ForceOnlinePinBelowCtlsCvm")
    private boolean forceOnlinePinBelowCtlsCvm;
    @SerializedName("ForceSignatureForNoCvm")
    @ColumnInfo(name = "ForceSignatureForNoCvm")
    private boolean forceSignatureForNoCvm;
    @SerializedName("GoGreenCustomerCopy")
    @ColumnInfo(name = "GoGreenCustomerCopy")
    private boolean goGreenCustomerCopy;
    @SerializedName("GoGreenMerchantCopy")
    @ColumnInfo(name = "GoGreenMerchantCopy")
    private boolean goGreenMerchantCopy;
    @SerializedName("IccOfflineAsMag")
    @ColumnInfo(name = "IccOfflineAsMag")
    private boolean iccOfflineAsMag;
    @SerializedName("IccRefundAsMag")
    @ColumnInfo(name = "IccRefundAsMag")
    private boolean iccRefundAsMag;
    @SerializedName("IssName")
    @ColumnInfo(name = "IssName")
    @TLVOptions(paddingLength = 20)
    private String issName;
    @SerializedName("ManualMaxAmount")
    @ColumnInfo(name = "ManualMaxAmount")
    private String manualMaxAmount;
    @SerializedName("MaskExpiryDateBank")
    @ColumnInfo(name = "MaskExpiryDateBank")
    private boolean maskExpiryDateBank;
    @SerializedName("MaskExpiryDateCustomer")
    @ColumnInfo(name = "MaskExpiryDateCustomer")
    private boolean maskExpiryDateCustomer;
    @SerializedName("MaskExpiryDateMerchant")
    @ColumnInfo(name = "MaskExpiryDateMerchant")
    private boolean maskExpiryDateMerchant;
    @SerializedName("MaskMidTidCustomer")
    @ColumnInfo(name = "MaskMidTidCustomer")
    private boolean maskMidTidCustomer;
    @SerializedName("MaskMidTidMerchant")
    @ColumnInfo(name = "MaskMidTidMerchant")
    private boolean maskMidTidMerchant;
    @SerializedName("MaskPanBank")
    @ColumnInfo(name = "MaskPanBank")
    private boolean maskPanBank;
    @SerializedName("MaskPanCustomer")
    @ColumnInfo(name = "MaskPanCustomer")
    private boolean maskPanCustomer;
    @SerializedName("MaskPanMerchant")
    @ColumnInfo(name = "MaskPanMerchant")
    private boolean maskPanMerchant;
    @SerializedName("MaxTxnLimit")
    @ColumnInfo(name = "MaxTxnLimit")
    private String maxTxnLimit;
    @SerializedName("MinTransactionAmount")
    @ColumnInfo(name = "MinTransactionAmount")
    private String minTransactionAmount;
    @SerializedName("PinAuthorization")
    @ColumnInfo(name = "PinAuthorization")
    private boolean pinAuthorization;
    @SerializedName("PinBalance")
    @ColumnInfo(name = "PinBalance")
    private boolean pinBalance;
    @SerializedName("PinCash")
    @ColumnInfo(name = "PinCash")
    private boolean pinCash;
    @SerializedName("PinEntryRequired")
    @ColumnInfo(name = "PinEntryRequired")
    private boolean pinEntryRequired;
    @SerializedName("PinRefund")
    @ColumnInfo(name = "PinRefund")
    private boolean pinRefund;
    @SerializedName("PinSale")
    @ColumnInfo(name = "PinSale")
    private boolean pinSale;
    @SerializedName("PreAuthConditionCode")
    @ColumnInfo(name = "PreAuthConditionCode")
    private boolean preAuthConditionCode;
    @SerializedName("PrintBankCopy")
    @ColumnInfo(name = "PrintBankCopy")
    private boolean printBankCopy;
    @SerializedName("PrintCustomerCopy")
    @ColumnInfo(name = "PrintCustomerCopy")
    private boolean printCustomerCopy;
    @SerializedName("PrintIccText")
    @ColumnInfo(name = "PrintIccText")
    private boolean printIccText;
    @SerializedName("PrintMerchantCopy")
    @ColumnInfo(name = "PrintMerchantCopy")
    private boolean printMerchantCopy;
    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;
    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    private String recordName;
    @SerializedName("RefundIgnoreDeclinedByCard")
    @ColumnInfo(name = "RefundIgnoreDeclinedByCard")
    private boolean refundIgnoreDeclinedByCard;
    @SerializedName("RefundOffline")
    @ColumnInfo(name = "RefundOffline")
    private boolean refundOffline;
    @SerializedName("SendTrack1")
    @ColumnInfo(name = "SendTrack1")
    private boolean sendTrack1;
    @SerializedName("txtId")
    @ColumnInfo(name = "txtId")
    private String txtId;
    @SerializedName("UseSpecialPanMasking")
    @ColumnInfo(name = "UseSpecialPanMasking")
    private boolean useSpecialPanMasking;
    @SerializedName("VoidOffline")
    @ColumnInfo(name = "VoidOffline")
    private boolean voidOffline;
    @SerializedName("ZeroFees")
    @ColumnInfo(name = "ZeroFees")
    private boolean zeroFees;

    private String issTag;


    @SerializedName("BlockCashOut")
    @ColumnInfo(name = "BlockCashOut")
    private String blockCashOut;
    @SerializedName("enableDccForCtls")
    @ColumnInfo(name = "enableDccForCtls")
    private String enableDccForCtls;
    @SerializedName("forceOnlinePin")
    @ColumnInfo(name = "forceOnlinePin")
    private String forceOnlinePin;
    @SerializedName("BlockCashIn")
    @ColumnInfo(name = "BlockCashIn")
    private String BlockCashIn;

    public String getRecordId() {
        return recordId;
    }

    public String getRecordName() {
        return recordName;
    }

    public String getBlockCashOut() {
        return blockCashOut;
    }

    public void setBlockCashOut(String blockCashOut) {
        this.blockCashOut = blockCashOut;
    }

    public String getEnableDccForCtls() {
        return enableDccForCtls;
    }

    public void setEnableDccForCtls(String enableDccForCtls) {
        this.enableDccForCtls = enableDccForCtls;
    }

    public String getForceOnlinePin() {
        return forceOnlinePin;
    }

    public void setForceOnlinePin(String forceOnlinePin) {
        this.forceOnlinePin = forceOnlinePin;
    }

    public String getBlockCashIn() {
        return BlockCashIn;
    }

    public void setBlockCashIn(String blockCashIn) {
        BlockCashIn = blockCashIn;
    }

    @NonNull
    @Override
    public String toString() {
        return "IssuerApex{" +
               ", alwaysSendExpDate=" + alwaysSendExpDate +
               ", amexIssuer=" + amexIssuer +
               ", blockAdjust=" + blockAdjust +
               ", blockAuthorization=" + blockAuthorization +
               ", blockBalance=" + blockBalance +
               ", blockCash=" + blockCash +
               ", blockCompletion=" + blockCompletion +
               ", blockLoyalty=" + blockLoyalty +
               ", blockManualEntry=" + blockManualEntry +
               ", blockMoto=" + blockMoto +
               ", blockOfflineSale=" + blockOfflineSale +
               ", blockRefund=" + blockRefund +
               ", blockReload=" + blockReload +
               ", blockReloadManualEntry=" + blockReloadManualEntry +
               ", blockSale=" + blockSale +
               ", blockVoid=" + blockVoid +
               ", cashoutMaxAmount='" + cashoutMaxAmount + '\'' +
               ", checkExpDate=" + checkExpDate +
               ", checkServiceCode=" + checkServiceCode +
               ", completionCeilingPercentage=" + completionCeilingPercentage +
               ", completionOffline=" + completionOffline +
               ", cupIssuer=" + cupIssuer +
               ", dccDisclaimer1='" + dccDisclaimer1 + '\'' +
               ", dccDisclaimer10='" + dccDisclaimer10 + '\'' +
               ", dccDisclaimer2='" + dccDisclaimer2 + '\'' +
               ", dccDisclaimer3='" + dccDisclaimer3 + '\'' +
               ", dccDisclaimer4='" + dccDisclaimer4 + '\'' +
               ", dccDisclaimer5='" + dccDisclaimer5 + '\'' +
               ", dccDisclaimer6='" + dccDisclaimer6 + '\'' +
               ", dccDisclaimer7='" + dccDisclaimer7 + '\'' +
               ", dccDisclaimer8='" + dccDisclaimer8 + '\'' +
               ", dccDisclaimer9='" + dccDisclaimer9 + '\'' +
               ", defaultTransaction='" + defaultTransaction + '\'' +
               ", enableCheckMod10=" + enableCheckMod10 +
               ", enableCvv2=" + enableCvv2 +
               ", enableDcc=" + enableDcc +
               ", enablePrintDeclinedReceipt=" + enablePrintDeclinedReceipt +
               ", enablePrintSurcharge=" + enablePrintSurcharge +
               ", enableTipProcessing=" + enableTipProcessing +
               ", expiryDateRequired=" + expiryDateRequired +
               ", floorLimit='" + floorLimit + '\'' +
               ", forceOnlinePinBelowCtlsCvm=" + forceOnlinePinBelowCtlsCvm +
               ", forceSignatureForNoCvm=" + forceSignatureForNoCvm +
               ", goGreenCustomerCopy=" + goGreenCustomerCopy +
               ", goGreenMerchantCopy=" + goGreenMerchantCopy +
               ", iccOfflineAsMag=" + iccOfflineAsMag +
               ", iccRefundAsMag=" + iccRefundAsMag +
               ", issName='" + issName + '\'' +
               ", manualMaxAmount='" + manualMaxAmount + '\'' +
               ", maskExpiryDateBank=" + maskExpiryDateBank +
               ", maskExpiryDateCustomer=" + maskExpiryDateCustomer +
               ", maskExpiryDateMerchant=" + maskExpiryDateMerchant +
               ", maskMidTidCustomer=" + maskMidTidCustomer +
               ", maskMidTidMerchant=" + maskMidTidMerchant +
               ", maskPanBank=" + maskPanBank +
               ", maskPanCustomer=" + maskPanCustomer +
               ", maskPanMerchant=" + maskPanMerchant +
               ", maxTxnLimit='" + maxTxnLimit + '\'' +
               ", minTransactionAmount='" + minTransactionAmount + '\'' +
               ", pinAuthorization=" + pinAuthorization +
               ", pinBalance=" + pinBalance +
               ", pinCash=" + pinCash +
               ", pinEntryRequired=" + pinEntryRequired +
               ", pinRefund=" + pinRefund +
               ", pinSale=" + pinSale +
               ", preAuthConditionCode=" + preAuthConditionCode +
               ", printBankCopy=" + printBankCopy +
               ", printCustomerCopy=" + printCustomerCopy +
               ", printIccText=" + printIccText +
               ", printMerchantCopy=" + printMerchantCopy +
               ", recordId='" + recordId + '\'' +
               ", recordName='" + recordName + '\'' +
               ", refundIgnoreDeclinedByCard=" + refundIgnoreDeclinedByCard +
               ", refundOffline=" + refundOffline +
               ", sendTrack1=" + sendTrack1 +
               ", txtId='" + txtId + '\'' +
               ", useSpecialPanMasking=" + useSpecialPanMasking +
               ", voidOffline=" + voidOffline +
               ", zeroFees=" + zeroFees +
               '}';
    }

    public String getIssTag() {
        return issTag;
    }

    public void setIssTag(String issTag) {
        this.issTag = issTag;
    }


    public IssuerApex() {
    }


    public boolean isVoidOffline() {
        return voidOffline;
    }

    public void setVoidOffline(boolean voidOffline) {
        this.voidOffline = voidOffline;
    }

    public boolean isPinCash() {
        return pinCash;
    }

    public void setPinCash(boolean pinCash) {
        this.pinCash = pinCash;
    }

    public boolean isPinEntryRequired() {
        return pinEntryRequired;
    }

    public void setPinEntryRequired(boolean pinEntryRequired) {
        this.pinEntryRequired = pinEntryRequired;
    }

    public boolean isPinRefund() {
        return pinRefund;
    }

    public void setPinRefund(boolean pinRefund) {
        this.pinRefund = pinRefund;
    }

    public boolean isPinSale() {
        return pinSale;
    }

    public void setPinSale(boolean pinSale) {
        this.pinSale = pinSale;
    }

    public boolean isPreAuthConditionCode() {
        return preAuthConditionCode;
    }

    public void setPreAuthConditionCode(boolean preAuthConditionCode) {
        this.preAuthConditionCode = preAuthConditionCode;
    }

    public boolean isUseSpecialPanMasking() {
        return useSpecialPanMasking;
    }

    public void setUseSpecialPanMasking(boolean useSpecialPanMasking) {
        this.useSpecialPanMasking = useSpecialPanMasking;
    }

    public boolean isZeroFees() {
        return zeroFees;
    }

    public void setZeroFees(boolean zeroFees) {
        this.zeroFees = zeroFees;
    }

    public boolean isIccOfflineAsMag() {
        return iccOfflineAsMag;
    }

    public void setIccOfflineAsMag(boolean iccOfflineAsMag) {
        this.iccOfflineAsMag = iccOfflineAsMag;
    }

    public boolean isIccRefundAsMag() {
        return iccRefundAsMag;
    }

    public void setIccRefundAsMag(boolean iccRefundAsMag) {
        this.iccRefundAsMag = iccRefundAsMag;
    }

    public String getIssName() {
        return issName;
    }

    public void setIssName(String issName) {
        this.issName = issName;
    }

    public String getManualMaxAmount() {
        return manualMaxAmount;
    }

    public void setManualMaxAmount(String manualMaxAmount) {
        this.manualMaxAmount = manualMaxAmount;
    }

    public boolean isMaskExpiryDateBank() {
        return maskExpiryDateBank;
    }

    public void setMaskExpiryDateBank(boolean maskExpiryDateBank) {
        this.maskExpiryDateBank = maskExpiryDateBank;
    }

    public boolean isMaskExpiryDateCustomer() {
        return maskExpiryDateCustomer;
    }

    public void setMaskExpiryDateCustomer(boolean maskExpiryDateCustomer) {
        this.maskExpiryDateCustomer = maskExpiryDateCustomer;
    }

    public boolean isMaskExpiryDateMerchant() {
        return maskExpiryDateMerchant;
    }

    public void setMaskExpiryDateMerchant(boolean maskExpiryDateMerchant) {
        this.maskExpiryDateMerchant = maskExpiryDateMerchant;
    }

    public boolean isMaskMidTidCustomer() {
        return maskMidTidCustomer;
    }

    public void setMaskMidTidCustomer(boolean maskMidTidCustomer) {
        this.maskMidTidCustomer = maskMidTidCustomer;
    }

    public boolean isMaskMidTidMerchant() {
        return maskMidTidMerchant;
    }

    public void setMaskMidTidMerchant(boolean maskMidTidMerchant) {
        this.maskMidTidMerchant = maskMidTidMerchant;
    }

    public boolean isMaskPanBank() {
        return maskPanBank;
    }

    public void setMaskPanBank(boolean maskPanBank) {
        this.maskPanBank = maskPanBank;
    }

    public boolean isMaskPanCustomer() {
        return maskPanCustomer;
    }

    public void setMaskPanCustomer(boolean maskPanCustomer) {
        this.maskPanCustomer = maskPanCustomer;
    }

    public boolean isMaskPanMerchant() {
        return maskPanMerchant;
    }

    public void setMaskPanMerchant(boolean maskPanMerchant) {
        this.maskPanMerchant = maskPanMerchant;
    }

    public String getMaxTxnLimit() {
        return maxTxnLimit;
    }

    public void setMaxTxnLimit(String maxTxnLimit) {
        this.maxTxnLimit = maxTxnLimit;
    }

    public String getMinTransactionAmount() {
        return minTransactionAmount;
    }

    public void setMinTransactionAmount(String minTransactionAmount) {
        this.minTransactionAmount = minTransactionAmount;
    }

    public boolean isPinAuthorization() {
        return pinAuthorization;
    }

    public void setPinAuthorization(boolean pinAuthorization) {
        this.pinAuthorization = pinAuthorization;
    }

    public boolean isPinBalance() {
        return pinBalance;
    }

    public void setPinBalance(boolean pinBalance) {
        this.pinBalance = pinBalance;
    }

    public String getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }

    public boolean isSendTrack1() {
        return sendTrack1;
    }

    public void setSendTrack1(boolean sendTrack1) {
        this.sendTrack1 = sendTrack1;
    }

    public boolean isRefundOffline() {
        return refundOffline;
    }

    public void setRefundOffline(boolean refundOffline) {
        this.refundOffline = refundOffline;
    }

    public boolean isRefundIgnoreDeclinedByCard() {
        return refundIgnoreDeclinedByCard;
    }

    public void setRefundIgnoreDeclinedByCard(boolean refundIgnoreDeclinedByCard) {
        this.refundIgnoreDeclinedByCard = refundIgnoreDeclinedByCard;
    }

    public boolean isPrintMerchantCopy() {
        return printMerchantCopy;
    }

    public void setPrintMerchantCopy(boolean printMerchantCopy) {
        this.printMerchantCopy = printMerchantCopy;
    }

    public boolean isPrintIccText() {
        return printIccText;
    }

    public void setPrintIccText(boolean printIccText) {
        this.printIccText = printIccText;
    }

    public boolean isPrintCustomerCopy() {
        return printCustomerCopy;
    }

    public void setPrintCustomerCopy(boolean printCustomerCopy) {
        this.printCustomerCopy = printCustomerCopy;
    }

    public boolean isPrintBankCopy() {
        return printBankCopy;
    }

    public void setPrintBankCopy(boolean printBankCopy) {
        this.printBankCopy = printBankCopy;
    }

    public String getDccDisclaimer8() {
        return dccDisclaimer8;
    }

    public void setDccDisclaimer8(String dccDisclaimer8) {
        this.dccDisclaimer8 = dccDisclaimer8;
    }

    public String getDccDisclaimer9() {
        return dccDisclaimer9;
    }

    public void setDccDisclaimer9(String dccDisclaimer9) {
        this.dccDisclaimer9 = dccDisclaimer9;
    }

    public String getDefaultTransaction() {
        return defaultTransaction;
    }

    public void setDefaultTransaction(String defaultTransaction) {
        this.defaultTransaction = defaultTransaction;
    }

    public boolean isEnableCheckMod10() {
        return enableCheckMod10;
    }

    public void setEnableCheckMod10(boolean enableCheckMod10) {
        this.enableCheckMod10 = enableCheckMod10;
    }

    public boolean isEnableCvv2() {
        return enableCvv2;
    }

    public void setEnableCvv2(boolean enableCvv2) {
        this.enableCvv2 = enableCvv2;
    }

    public boolean isEnableDcc() {
        return enableDcc;
    }

    public void setEnableDcc(boolean enableDcc) {
        this.enableDcc = enableDcc;
    }

    public boolean isEnablePrintDeclinedReceipt() {
        return enablePrintDeclinedReceipt;
    }

    public void setEnablePrintDeclinedReceipt(boolean enablePrintDeclinedReceipt) {
        this.enablePrintDeclinedReceipt = enablePrintDeclinedReceipt;
    }

    public boolean isEnablePrintSurcharge() {
        return enablePrintSurcharge;
    }

    public void setEnablePrintSurcharge(boolean enablePrintSurcharge) {
        this.enablePrintSurcharge = enablePrintSurcharge;
    }

    public boolean isEnableTipProcessing() {
        return enableTipProcessing;
    }

    public void setEnableTipProcessing(boolean enableTipProcessing) {
        this.enableTipProcessing = enableTipProcessing;
    }

    public boolean isExpiryDateRequired() {
        return expiryDateRequired;
    }

    public void setExpiryDateRequired(boolean expiryDateRequired) {
        this.expiryDateRequired = expiryDateRequired;
    }

    public String getFloorLimit() {
        return floorLimit;
    }

    public void setFloorLimit(String floorLimit) {
        this.floorLimit = floorLimit;
    }

    public boolean isForceOnlinePinBelowCtlsCvm() {
        return forceOnlinePinBelowCtlsCvm;
    }

    public void setForceOnlinePinBelowCtlsCvm(boolean forceOnlinePinBelowCtlsCvm) {
        this.forceOnlinePinBelowCtlsCvm = forceOnlinePinBelowCtlsCvm;
    }

    public boolean isForceSignatureForNoCvm() {
        return forceSignatureForNoCvm;
    }

    public void setForceSignatureForNoCvm(boolean forceSignatureForNoCvm) {
        this.forceSignatureForNoCvm = forceSignatureForNoCvm;
    }

    public boolean isGoGreenCustomerCopy() {
        return goGreenCustomerCopy;
    }

    public void setGoGreenCustomerCopy(boolean goGreenCustomerCopy) {
        this.goGreenCustomerCopy = goGreenCustomerCopy;
    }

    public boolean isGoGreenMerchantCopy() {
        return goGreenMerchantCopy;
    }

    public void setGoGreenMerchantCopy(boolean goGreenMerchantCopy) {
        this.goGreenMerchantCopy = goGreenMerchantCopy;
    }

    public boolean isBlockSale() {
        return blockSale;
    }

    public void setBlockSale(boolean blockSale) {
        this.blockSale = blockSale;
    }

    public boolean isBlockVoid() {
        return blockVoid;
    }

    public void setBlockVoid(boolean blockVoid) {
        this.blockVoid = blockVoid;
    }

    public String getCashoutMaxAmount() {
        return cashoutMaxAmount;
    }

    public void setCashoutMaxAmount(String cashoutMaxAmount) {
        this.cashoutMaxAmount = cashoutMaxAmount;
    }

    public boolean isCheckExpDate() {
        return checkExpDate;
    }

    public void setCheckExpDate(boolean checkExpDate) {
        this.checkExpDate = checkExpDate;
    }

    public boolean isCheckServiceCode() {
        return checkServiceCode;
    }

    public void setCheckServiceCode(boolean checkServiceCode) {
        this.checkServiceCode = checkServiceCode;
    }

    public boolean isCompletionCeilingPercentage() {
        return completionCeilingPercentage;
    }

    public void setCompletionCeilingPercentage(boolean completionCeilingPercentage) {
        this.completionCeilingPercentage = completionCeilingPercentage;
    }

    public boolean isCompletionOffline() {
        return completionOffline;
    }

    public void setCompletionOffline(boolean completionOffline) {
        this.completionOffline = completionOffline;
    }

    public boolean isCupIssuer() {
        return cupIssuer;
    }

    public void setCupIssuer(boolean cupIssuer) {
        this.cupIssuer = cupIssuer;
    }

    public String getDccDisclaimer1() {
        return dccDisclaimer1;
    }

    public void setDccDisclaimer1(String dccDisclaimer1) {
        this.dccDisclaimer1 = dccDisclaimer1;
    }

    public String getDccDisclaimer10() {
        return dccDisclaimer10;
    }

    public void setDccDisclaimer10(String dccDisclaimer10) {
        this.dccDisclaimer10 = dccDisclaimer10;
    }

    public String getDccDisclaimer2() {
        return dccDisclaimer2;
    }

    public void setDccDisclaimer2(String dccDisclaimer2) {
        this.dccDisclaimer2 = dccDisclaimer2;
    }

    public String getDccDisclaimer3() {
        return dccDisclaimer3;
    }

    public void setDccDisclaimer3(String dccDisclaimer3) {
        this.dccDisclaimer3 = dccDisclaimer3;
    }

    public String getDccDisclaimer4() {
        return dccDisclaimer4;
    }

    public void setDccDisclaimer4(String dccDisclaimer4) {
        this.dccDisclaimer4 = dccDisclaimer4;
    }

    public String getDccDisclaimer5() {
        return dccDisclaimer5;
    }

    public void setDccDisclaimer5(String dccDisclaimer5) {
        this.dccDisclaimer5 = dccDisclaimer5;
    }

    public String getDccDisclaimer6() {
        return dccDisclaimer6;
    }

    public void setDccDisclaimer6(String dccDisclaimer6) {
        this.dccDisclaimer6 = dccDisclaimer6;
    }

    public String getDccDisclaimer7() {
        return dccDisclaimer7;
    }

    public void setDccDisclaimer7(String dccDisclaimer7) {
        this.dccDisclaimer7 = dccDisclaimer7;
    }

    public boolean isAmexIssuer() {
        return amexIssuer;
    }

    public void setAmexIssuer(boolean amexIssuer) {
        this.amexIssuer = amexIssuer;
    }

    public boolean isBlockAdjust() {
        return blockAdjust;
    }

    public void setBlockAdjust(boolean blockAdjust) {
        this.blockAdjust = blockAdjust;
    }

    public boolean isBlockAuthorization() {
        return blockAuthorization;
    }

    public void setBlockAuthorization(boolean blockAuthorization) {
        this.blockAuthorization = blockAuthorization;
    }

    public boolean isBlockBalance() {
        return blockBalance;
    }

    public void setBlockBalance(boolean blockBalance) {
        this.blockBalance = blockBalance;
    }

    public boolean isBlockCash() {
        return blockCash;
    }

    public void setBlockCash(boolean blockCash) {
        this.blockCash = blockCash;
    }

    public boolean isBlockCompletion() {
        return blockCompletion;
    }

    public void setBlockCompletion(boolean blockCompletion) {
        this.blockCompletion = blockCompletion;
    }

    public boolean isBlockLoyalty() {
        return blockLoyalty;
    }

    public void setBlockLoyalty(boolean blockLoyalty) {
        this.blockLoyalty = blockLoyalty;
    }

    public boolean isBlockManualEntry() {
        return blockManualEntry;
    }

    public void setBlockManualEntry(boolean blockManualEntry) {
        this.blockManualEntry = blockManualEntry;
    }

    public boolean isBlockMoto() {
        return blockMoto;
    }

    public void setBlockMoto(boolean blockMoto) {
        this.blockMoto = blockMoto;
    }

    public boolean isBlockOfflineSale() {
        return blockOfflineSale;
    }

    public void setBlockOfflineSale(boolean blockOfflineSale) {
        this.blockOfflineSale = blockOfflineSale;
    }

    public boolean isBlockRefund() {
        return blockRefund;
    }

    public void setBlockRefund(boolean blockRefund) {
        this.blockRefund = blockRefund;
    }

    public boolean isBlockReload() {
        return blockReload;
    }

    public void setBlockReload(boolean blockReload) {
        this.blockReload = blockReload;
    }

    public boolean isBlockReloadManualEntry() {
        return blockReloadManualEntry;
    }

    public void setBlockReloadManualEntry(boolean blockReloadManualEntry) {
        this.blockReloadManualEntry = blockReloadManualEntry;
    }

    public boolean isAlwaysSendExpDate() {
        return alwaysSendExpDate;
    }

    public void setAlwaysSendExpDate(boolean alwaysSendExpDate) {
        this.alwaysSendExpDate = alwaysSendExpDate;
    }

    @Override
    public String tagPrefix() {
        return issTag;
    }

    @Override
    @Ignore
    public String recordId() {
        return recordId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    @Override
    @Ignore
    public String recordName() {
        return recordName;
    }

    @Override
    public void setTagPrefix(String prefix) {
        issTag = prefix;
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
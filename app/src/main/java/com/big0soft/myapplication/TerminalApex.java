package com.dps.pos.payment.apex.tms.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
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
 * Room entity for Terminal data
 * Table name: terminal
 */
@Entity(tableName = AppDatabase.RoomConstants.TERMINAL_TABLE_NAME)
public class TerminalApex implements Serializable, TmsTagInfo, TmsRecordValidation, Mapping2TagValue {
    private static final long serialVersionUID = 6529685098267757690L;

    @SerializedName("HeaderL1")
    @ColumnInfo(name = "HeaderL1")
    @TLVOptions(paddingLength = 40)
    private String HeaderL1; //	40	ASC	Receipt Header Line 1
    @SerializedName("HeaderL2")
    @ColumnInfo(name = "HeaderL2")
    @TLVOptions(paddingLength = 40)
    private String HeaderL2; //	40	ASC	Receipt Header Line 2
    @SerializedName("HeaderL3")
    @ColumnInfo(name = "HeaderL3")
    @TLVOptions(paddingLength = 40)
    private String HeaderL3; //	40	ASC	Receipt Header Line 3
    @SerializedName("HeaderL4")
    @ColumnInfo(name = "HeaderL4")
    @TLVOptions(paddingLength = 40)
    private String HeaderL4; //	40	ASC	Receipt Header Line 4
    @SerializedName("HeaderL5")
    @ColumnInfo(name = "HeaderL5")
    @TLVOptions(paddingLength = 40)
    private String HeaderL5; //	40	ASC	Receipt Header Line 5
    @SerializedName("FooterL1")
    @ColumnInfo(name = "FooterL1")
    @TLVOptions(paddingLength = 40)
    private String FooterL1; //	40	ASC	Receipt Footer Line 1
    @SerializedName("FooterL2")
    @ColumnInfo(name = "FooterL2")
    @TLVOptions(paddingLength = 40)
    private String FooterL2; //	40	ASC	Receipt Footer Line 2
    @SerializedName("FooterL3")
    @ColumnInfo(name = "FooterL3")
    @TLVOptions(paddingLength = 40)
    private String FooterL3; //	40	ASC	Receipt Footer Line 3
    @SerializedName("FooterL4")
    @ColumnInfo(name = "FooterL4")
    @TLVOptions(paddingLength = 40)
    private String FooterL4; //	40	ASC	Receipt Footer Line 4
    @SerializedName("FooterL5")
    @ColumnInfo(name = "FooterL5")
    @TLVOptions(paddingLength = 40)
    private String FooterL5; //	40	ASC	Receipt Footer Line 5
    @SerializedName("passwordMaintenance")
    @ColumnInfo(name = "passwordMaintenance")
    private String passwordMaintenance; //	6	ASC	Maintenance P
    @SerializedName("passwordMerchant")// assword
    @ColumnInfo(name = "passwordMerchant")
    private String passwordMerchant; //	6	ASC	Merchant Password
    @SerializedName("EnablePasswordSale")
    @ColumnInfo(name = "EnablePasswordSale")
    private boolean EnablePasswordSale; //	1	BOOL	Enable Sale Transaction
    @SerializedName("EnablePasswordRefund")
    @ColumnInfo(name = "EnablePasswordRefund")
    private boolean EnablePasswordRefund; //	1	BOOL	Enable Refund Transaction
    @SerializedName("EnablePasswordSettle")
    @ColumnInfo(name = "EnablePasswordSettle")
    private boolean EnablePasswordSettle; //	1	BOOL	Enable Settle
    @SerializedName("EnablePasswordVoid")
    @ColumnInfo(name = "EnablePasswordVoid")
    private boolean EnablePasswordVoid; //	1	BOOL
    @SerializedName("EnablePasswordAuth")
    @ColumnInfo(name = "EnablePasswordAuth")
    private boolean EnablePasswordAuth; //	1	BOOL
    @SerializedName("EnablePasswordCompletion")
    @ColumnInfo(name = "EnablePasswordCompletion")
    private boolean EnablePasswordCompletion; //	1	BOOL
    @SerializedName("EnablePasswordOffline")
    @ColumnInfo(name = "EnablePasswordOffline")
    private boolean EnablePasswordOffline; //	1	BOOL
    @SerializedName("EnablePasswordBalance")
    @ColumnInfo(name = "EnablePasswordBalance")
    private boolean EnablePasswordBalance; //	1	BOOL
    @SerializedName("EnablePasswordMoto")
    @ColumnInfo(name = "EnablePasswordMoto")
    private boolean EnablePasswordMoto; //	1	BOOL
    @SerializedName("EnablePasswordCash")
    @ColumnInfo(name = "EnablePasswordCash")
    private boolean EnablePasswordCash; //	1	BOOL
    @SerializedName("EnablePasswordReload")
    @ColumnInfo(name = "EnablePasswordReload")
    private boolean EnablePasswordReload; //	1	BOOL
    @SerializedName("EnablePasswordAdjust")
    @ColumnInfo(name = "EnablePasswordAdjust")
    private boolean EnablePasswordAdjust; //	1	BOOL
    @SerializedName("EnablePasswordManual")
    @ColumnInfo(name = "EnablePasswordManual")
    private boolean EnablePasswordManual; //	1	BOOL
    @SerializedName("EnablePasswordSalePromo")
    @ColumnInfo(name = "EnablePasswordSalePromo")
    private boolean EnablePasswordSalePromo; //	1	BOOL
    @SerializedName("EnablePasswordInstallment")
    @ColumnInfo(name = "EnablePasswordInstallment")
    private boolean EnablePasswordInstallment; //	1	BOOL
    @SerializedName("EnablePasswordHotel")
    @ColumnInfo(name = "EnablePasswordHotel")
    private boolean EnablePasswordHotel; //	1	BOOL
    @SerializedName("EnablePasswordRefundQr")
    @ColumnInfo(name = "EnablePasswordRefundQr")
    private boolean EnablePasswordRefundQr; //	1	BOOL
    @SerializedName("CountryCode")
    @ColumnInfo(name = "CountryCode")
    private String CountryCode; //	2	BCD
    @SerializedName("CurrencyCode")// 	Country Code
    @ColumnInfo(name = "CurrencyCode")
    private String CurrencyCode;//	2	BCD
    @SerializedName("CurrencySymbol")
    @ColumnInfo(name = "CurrencySymbol")
    private String CurrencySymbol;//	3
    @SerializedName("CurrencyDP")// ASC
    @ColumnInfo(name = "CurrencyDP")
    private String CurrencyDP;//	1	BCD
    @SerializedName("maxTxnLimit")
    @ColumnInfo(name = "maxTxnLimit")
    private String maxTxnLimit;//	6	BCD
    @SerializedName("EmvTermCap")
    @ColumnInfo(name = "EmvTermCap")
    private String EmvTermCap;//	3	HEX
    @SerializedName("EmvTermAddCap")
    @ColumnInfo(name = "EmvTermAddCap")
    private String EmvTermAddCap;//	5	HEX
    @SerializedName("CtlsTermCap")
    @ColumnInfo(name = "CtlsTermCap")
    private String CtlsTermCap; // 3	HEX
    @SerializedName("CtlsTermAddCap")
    @ColumnInfo(name = "CtlsTermAddCap")
    private String CtlsTermAddCap; // 5	HEX
    @SerializedName("DisableChipFallback")
    @ColumnInfo(name = "DisableChipFallback")
    private boolean DisableChipFallback;//	1	BOO
    @SerializedName("ChipFallbackCounter")// L
    @ColumnInfo(name = "ChipFallbackCounter")
    private String ChipFallbackCounter;//	1
    @SerializedName("surchargeAmount")// BCD
    @ColumnInfo(name = "surchargeAmount")
    private String surchargeAmount;//	6	BCD
    @SerializedName("surchargePercentage1")
    @ColumnInfo(name = "surchargePercentage1")
    private String surchargePercentage1;//	1	BCD
    @SerializedName("surchargePercentage2")
    @ColumnInfo(name = "surchargePercentage2")
    private String surchargePercentage2;//	2	BCD
    @SerializedName("installmentMinAmount")
    @ColumnInfo(name = "installmentMinAmount")
    private String installmentMinAmount;//	6	BCD
    @SerializedName("SalaryCashOutFeePercentage1")
    @ColumnInfo(name = "SalaryCashOutFeePercentage1")
    private String SalaryCashOutFeePercentage1;//	1	BCD
    @SerializedName("SalaryCashOutFeePercentage2")
    @ColumnInfo(name = "SalaryCashOutFeePercentage2")
    private String SalaryCashOutFeePercentage2;//	1	BCD
    @SerializedName("EnablePreAuthCompletion")
    @ColumnInfo(name = "EnablePreAuthCompletion")
    private boolean EnablePreAuthCompletion;
    @SerializedName("PreAuthDays")// 1	BOOL
    @ColumnInfo(name = "PreAuthDays")
    private String PreAuthDays; //	1	BCD
    @SerializedName("settleAttempts")
    @ColumnInfo(name = "settleAttempts")
    private String settleAttempts; //	1
    @SerializedName("settleTime")// BCD
    @ColumnInfo(name = "settleTime")
    private String settleTime; //	2	BCD
    @SerializedName("foreignSurchargeAmount")
    @ColumnInfo(name = "foreignSurchargeAmount")
    private String foreignSurchargeAmount; //	6	BCD
    @SerializedName("foreignSurchargePercentage1")
    @ColumnInfo(name = "foreignSurchargePercentage1")
    private String foreignSurchargePercentage1; //	1	BCD
    @SerializedName("foreignSurchargePercentage2")
    @ColumnInfo(name = "foreignSurchargePercentage2")
    private String foreignSurchargePercentage2; //	2	BCD
    @SerializedName("defaultSurchargeForeign")
    @ColumnInfo(name = "defaultSurchargeForeign")
    private boolean defaultSurchargeForeign;//	1	BOOL
    @SerializedName("enableTipProcessing")
    @ColumnInfo(name = "enableTipProcessing")
    private boolean enableTipProcessing;//	1	BOOL
    @SerializedName("disableTipPrompt")
    @ColumnInfo(name = "disableTipPrompt")
    private boolean disableTipPrompt;//	1	BOOL
    @SerializedName("enableTipAdjPromptTotal")
    @ColumnInfo(name = "enableTipAdjPromptTotal")
    private boolean enableTipAdjPromptTotal;//	1	BOOL
    @SerializedName("tipPerc1")
    @ColumnInfo(name = "tipPerc1")
    private String tipPerc1;//	1	BCD
    @SerializedName("tipPerc2")
    @ColumnInfo(name = "tipPerc2")
    private String tipPerc2;//	1	BCD
    @SerializedName("tipPerc3")
    @ColumnInfo(name = "tipPerc3")
    private String tipPerc3;//	1	BCD
    @SerializedName("tipPerc4")
    @ColumnInfo(name = "tipPerc4")
    private String tipPerc4;//	1	BCD
    @SerializedName("maxTipPercentage")
    @ColumnInfo(name = "maxTipPercentage")
    private String maxTipPercentage;//	1	BCD
    @SerializedName("enableMobileWallet")
    @ColumnInfo(name = "enableMobileWallet")
    private boolean enableMobileWallet;//	1	BOOL
    @SerializedName("enableMobileCashIn")
    @ColumnInfo(name = "enableMobileCashIn")
    private boolean enableMobileCashIn;//	1	BOOL
    @SerializedName("enableMobileCashOut")
    @ColumnInfo(name = "enableMobileCashOut")
    private boolean enableMobileCashOut;//	1	BOOL
    @SerializedName("enableMobileCashSale")
    @ColumnInfo(name = "enableMobileCashSale")
    private boolean enableMobileCashSale;//	1	BOOL
    @SerializedName("enableWalletCashInPassword")
    @ColumnInfo(name = "enableWalletCashInPassword")
    private boolean enableWalletCashInPassword;//	1	BOOL
    @SerializedName("enableWalletCashOutPassword")
    @ColumnInfo(name = "enableWalletCashOutPassword")
    private boolean enableWalletCashOutPassword;//	1	BOOL
    @SerializedName("enableWalletSalePassword")
    @ColumnInfo(name = "enableWalletSalePassword")
    private boolean enableWalletSalePassword;//	1
    @SerializedName("mobileWalletPassword")// BOOL
    @ColumnInfo(name = "mobileWalletPassword")
    private String mobileWalletPassword;//	2
    @SerializedName("mobilePhonePrefix")// BCD
    @ColumnInfo(name = "mobilePhonePrefix")
    private String mobilePhonePrefix;//	6	ASC
    @SerializedName("mobilePhoneMinLen")
    @ColumnInfo(name = "mobilePhoneMinLen")
    private String mobilePhoneMinLen;//	1	BCD
    @SerializedName("mobilePhoneMaxLen")
    @ColumnInfo(name = "mobilePhoneMaxLen")
    private String mobilePhoneMaxLen;//	1	BCD
    @SerializedName("enableApexEcr")
    @ColumnInfo(name = "enableApexEcr")
    private boolean enableApexEcr;//	1	BOOL
    @SerializedName("blockWifi")
    @ColumnInfo(name = "blockWifi")
    private boolean blockWifi;//	1	BOO
    @SerializedName("apnWhiteList")// L
    @ColumnInfo(name = "apnWhiteList")
    private String apnWhiteList;//	40	ASC
    @SerializedName("qrMpayFeeAmount")
    @ColumnInfo(name = "qrMpayFeeAmount")
    private String qrMpayFeeAmount;//	6	BCD
    @SerializedName("qrMpayFeePercentage1")
    @ColumnInfo(name = "qrMpayFeePercentage1")
    private String qrMpayFeePercentage1;//	1	BCD
    @SerializedName("qrMpayFeePercentage2")
    @ColumnInfo(name = "qrMpayFeePercentage2")
    private String qrMpayFeePercentage2;//	2
    @SerializedName("qrMpayMaxAmount")// BCD
    @ColumnInfo(name = "qrMpayMaxAmount")
    private String qrMpayMaxAmount;//	6	BCD
    @SerializedName("ecrComPortConfig")
    @ColumnInfo(name = "ecrComPortConfig")
    private String ecrComPortConfig;//	30	ASC
    @SerializedName("enableEcrUsb")
    @ColumnInfo(name = "enableEcrUsb")
    private boolean enableEcrUsb;//	1	BOOL
    @SerializedName("enableEcrOnly")
    @ColumnInfo(name = "enableEcrOnly")
    private boolean enableEcrOnly;//	1	BOOL
    @SerializedName("enablePosPrintReceiptEcr")
    @ColumnInfo(name = "enablePosPrintReceiptEcr")
    private boolean enablePosPrintReceiptEcr;//	1	BOOL
    @SerializedName("enableEcrRs232")
    @ColumnInfo(name = "enableEcrRs232")
    private boolean enableEcrRs232;//	1	BOOL
    @SerializedName("enableMceProcessing")
    @ColumnInfo(name = "enableMceProcessing")
    private boolean enableMceProcessing;//	1	BOOL

    @SerializedName("screenSaverTimeout")
    @ColumnInfo(name = "screenSaverTimeout")
    private int screenSaverTimeout;//	2	BCD (AH - check conversion to integer)
    @SerializedName("screenSaverImageInterval")
    @ColumnInfo(name = "screenSaverImageInterval")
    private String screenSaverImageInterval;//	2
    @SerializedName("terminalRestartTime")// BCD
    @ColumnInfo(name = "terminalRestartTime")
    private String terminalRestartTime;//	2	BCD
    @SerializedName("disableTextToSpeack")
    @ColumnInfo(name = "disableTextToSpeack")
    private boolean disableTextToSpeack;//	1	BOOL
    @SerializedName("disableRpmHeartbeat")
    @ColumnInfo(name = "disableRpmHeartbeat")
    private boolean disableRpmHeartbeat;//	1	BOOL
    @SerializedName("enableDozeMode")
    @ColumnInfo(name = "enableDozeMode")
    private boolean enableDozeMode;//	1
    @SerializedName("PasswordSale")// BOOL
    @ColumnInfo(name = "PasswordSale")
    private String PasswordSale;//	2	BCD
    @SerializedName("PasswordRefund")
    @ColumnInfo(name = "PasswordRefund")
    private String PasswordRefund;//	2	BCD
    @SerializedName("PasswordSettle")
    @ColumnInfo(name = "PasswordSettle")
    private String PasswordSettle;//	2
    @SerializedName("PasswordVoid")// BCD
    @ColumnInfo(name = "PasswordVoid")
    private String PasswordVoid;//	2	BCD
    @SerializedName("PasswordAuth")
    @ColumnInfo(name = "PasswordAuth")
    private String PasswordAuth;//	2	BCD
    @SerializedName("PasswordCompletion")
    @ColumnInfo(name = "PasswordCompletion")
    private String PasswordCompletion;//	2
    @SerializedName("PasswordOffline")// BCD
    @ColumnInfo(name = "PasswordOffline")
    private String PasswordOffline;//	2	BCD
    @SerializedName("PasswordBalance")
    @ColumnInfo(name = "PasswordBalance")
    private String PasswordBalance;//	2
    @SerializedName("PasswordMoto")// BCD
    @ColumnInfo(name = "PasswordMoto")
    private String PasswordMoto;//	2	BCD
    @SerializedName("PasswordCash")
    @ColumnInfo(name = "PasswordCash")
    private String PasswordCash;//	2	BCD
    @SerializedName("PasswordReload")
    @ColumnInfo(name = "PasswordReload")
    private String PasswordReload;//	2	BCD
    @SerializedName("PasswordAdjust")
    @ColumnInfo(name = "PasswordAdjust")
    private String PasswordAdjust;//	2	BCD
    @SerializedName("PasswordManual")
    @ColumnInfo(name = "PasswordManual")
    private String PasswordManual;//	2	BCD
    @SerializedName("PasswordSaleQr")
    @ColumnInfo(name = "PasswordSaleQr")
    private String PasswordSaleQr;//	2	BCD
    @SerializedName("PasswordSalePromo")
    @ColumnInfo(name = "PasswordSalePromo")
    private String PasswordSalePromo;//	2	BCD
    @SerializedName("PasswordInstallment")
    @ColumnInfo(name = "PasswordInstallment")
    private String PasswordInstallment;//
    @SerializedName("PasswordHotel")// 2	BCD
    @ColumnInfo(name = "PasswordHotel")
    private String PasswordHotel;//	2	BCD
    @SerializedName("PasswordRefundQr")
    @ColumnInfo(name = "PasswordRefundQr")
    private String PasswordRefundQr;//	2	BCD
    @SerializedName("BlockSale")
    @ColumnInfo(name = "BlockSale")
    private boolean BlockSale;//	1	BOOL
    @SerializedName("BlockRefund")
    @ColumnInfo(name = "BlockRefund")
    private boolean BlockRefund;//	1	BOOL
    @SerializedName("BlockSettle")
    @ColumnInfo(name = "BlockSettle")
    private boolean BlockSettle;//	1	BOOL
    @SerializedName("BlockVoid")
    @ColumnInfo(name = "BlockVoid")
    private boolean BlockVoid;//	1	BOOL
    @SerializedName("BlockAuth")
    @ColumnInfo(name = "BlockAuth")
    private boolean BlockAuth;//	1	BOOL
    @SerializedName("BlockCompletion")
    @ColumnInfo(name = "BlockCompletion")
    private boolean BlockCompletion;//	1	BOOL
    @SerializedName("BlockOffline")
    @ColumnInfo(name = "BlockOffline")
    private boolean BlockOffline;//	1	BOOL
    @SerializedName("BlockBalance")
    @ColumnInfo(name = "BlockBalance")
    private boolean BlockBalance;//	1	BOOL
    @SerializedName("BlockMoto")
    @ColumnInfo(name = "BlockMoto")
    private boolean BlockMoto;//	1	BOOL
    @SerializedName("BlockCash")
    @ColumnInfo(name = "BlockCash")
    private boolean BlockCash;//	1	BOOL
    @SerializedName("BlockReload")
    @ColumnInfo(name = "BlockReload")
    private boolean BlockReload;//	1	BOOL
    @SerializedName("BlockAdjust")
    @ColumnInfo(name = "BlockAdjust")
    private boolean BlockAdjust;//	1	BOOL
    @SerializedName("BlockManual")
    @ColumnInfo(name = "BlockManual")
    private boolean BlockManual;//	1	BOOL
    @SerializedName("BlockSaleQr")
    @ColumnInfo(name = "BlockSaleQr")
    private boolean BlockSaleQr;//	1	BOOL
    @SerializedName("BlockSalePromo")
    @ColumnInfo(name = "BlockSalePromo")
    private boolean BlockSalePromo;//	1	BOOL
    @SerializedName("BlockInstallment")
    @ColumnInfo(name = "BlockInstallment")
    private boolean BlockInstallment;//	1	BOOL
    @SerializedName("BlockHotel")
    @ColumnInfo(name = "BlockHotel")
    private boolean BlockHotel;//	1	BOOL
    @SerializedName("BlockRefundQr")
    @ColumnInfo(name = "BlockRefundQr")
    private boolean BlockRefundQr;//	1	BOOL
    @SerializedName("enableRpmReceipt")
    @ColumnInfo(name = "enableRpmReceipt")
    private boolean enableRpmReceipt;//	1	BOOL
    //    private IdleButtons idleButtons = new IdleButtons();
    @SerializedName("voidOffline")
    @ColumnInfo(name = "voidOffline")
    private boolean voidOffline;
    @SerializedName("enableStsPayService")
    @ColumnInfo(name = "enableStsPayService")
    private boolean enableStsPayService;
    @SerializedName("enableRpm")
    @ColumnInfo(name = "enableRpm")
    private boolean enableRpm;
    @SerializedName("timeIntervalStsRequests")
    @ColumnInfo(name = "timeIntervalStsRequests")
    private int timeIntervalStsRequests;
    @SerializedName("enableRpmReceiptChannels")
    @ColumnInfo(name = "enableRpmReceiptChannels")
    private boolean enableRpmReceiptChannels;
    @SerializedName("checkCountryCode")
    @ColumnInfo(name = "checkCountryCode")
    private boolean checkCountryCode;
    @SerializedName("enableCtlsDcc")
    @ColumnInfo(name = "enableCtlsDcc")
    private boolean enableCtlsDcc;

    @SerializedName("enableDccAuth")
    @ColumnInfo(name = "enableDccAuth")
    private boolean enableDccAuth;
    @SerializedName("enableDccCompletion")
    @ColumnInfo(name = "enableDccCompletion")
    private boolean enableDccCompletion;
    @SerializedName("enableDccSale")
    @ColumnInfo(name = "enableDccSale")
    private boolean enableDccSale;
    @SerializedName("enableDccSaleOffline")
    @ColumnInfo(name = "enableDccSaleOffline")
    private boolean enableDccSaleOffline;
    @SerializedName("enablePrintEmvInfo")
    @ColumnInfo(name = "enablePrintEmvInfo")
    private boolean enablePrintEmvInfo;
    @SerializedName("enableRpmClockInOut")
    @ColumnInfo(name = "enableRpmClockInOut")
    private boolean enableRpmClockInOut;
    @SerializedName("enableRpmHelpdeskReceipt")
    @ColumnInfo(name = "enableRpmHelpdeskReceipt")
    private boolean enableRpmHelpdeskReceipt;
    @SerializedName("enableRpmWarningReceipt")
    @ColumnInfo(name = "enableRpmWarningReceipt")
    private boolean enableRpmWarningReceipt;
    @SerializedName("disablePrintingSettlementReport")
    @ColumnInfo(name = "disablePrintingSettlementReport")
    private boolean disablePrintingSettlementReport;
    @SerializedName("txtSettleAttempts")
    @ColumnInfo(name = "txtSettleAttempts")
    private int txtSettleAttempts; // (AH - check BCD to integer conversion )
    @SerializedName("dialogTimeOutAfterFinish")
    @ColumnInfo(name = "dialogTimeOutAfterFinish")
    private int dialogTimeOutAfterFinish; // (AH - check bcd to int conversion)
    @SerializedName("enableDialogAfterFinish")
    @ColumnInfo(name = "enableDialogAfterFinish")
    private boolean enableDialogAfterFinish;

    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;
    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    private String recordName;
    @SerializedName("alertMaxTxnLimit")
    @ColumnInfo(name = "alertMaxTxnLimit")
    @TLVOptions(paddingLength = 30)
    private String alertMaxTxnLimit;
    @SerializedName("BlockCashIn")
    @ColumnInfo(name = "BlockCashIn")
    private boolean blockCashIn;

    @SerializedName("BlockWallet")
    @ColumnInfo(name = "BlockWallet")
    private boolean blockWallet;
    @SerializedName("enableCashierProcessing")
    @ColumnInfo(name = "enableCashierProcessing")
    private boolean enableCashierProcessing;
    @SerializedName("EnablePasswordCashIn")
    @ColumnInfo(name = "EnablePasswordCashIn")
    private boolean enablePasswordCashIn;
    @SerializedName("EnablePasswordCashOut")
    @ColumnInfo(name = "EnablePasswordCashOut")
    private boolean enablePasswordCashOut;
    @SerializedName("EnablePasswordWallet")
    @ColumnInfo(name = "EnablePasswordWallet")
    private boolean enablePasswordWallet;

    @SerializedName("foreignMinimumSurchargeAmount")
    @ColumnInfo(name = "foreignMinimumSurchargeAmount")
    private String foreignMinimumSurchargeAmount;
    @SerializedName("localMinimumSurchargeAmount")
    @ColumnInfo(name = "localMinimumSurchargeAmount")
    private String localMinimumSurchargeAmount;
    @SerializedName("mc1AlertMaxTxnLimit")
    @ColumnInfo(name = "mc1AlertMaxTxnLimit")
    @TLVOptions(paddingLength = 30)
    private String mc1AlertMaxTxnLimit;
    @SerializedName("mc1CurrencyCode")
    @ColumnInfo(name = "mc1CurrencyCode")
    private String mc1CurrencyCode;

    @SerializedName("CurrencyName")
    @ColumnInfo(name = "CurrencyName")
    @TLVOptions(paddingLength = 30)
    private String currencyName;

    @SerializedName("BlockCashOut")
    @ColumnInfo(name = "BlockCashOut")
    private boolean blockCashOut;

    @SerializedName("mc1CurrencyDP")
    @ColumnInfo(name = "mc1CurrencyDP")
    private String mc1CurrencyDP;
    @SerializedName("mc1CurrencyName")
    @ColumnInfo(name = "mc1CurrencyName")
    private String mc1CurrencyName;
    @SerializedName("mc1CurrencySymbol")
    @ColumnInfo(name = "mc1CurrencySymbol")
    @TLVOptions(paddingLength = 3)
    private String mc1CurrencySymbol;
    @SerializedName("mc1MaxTxnLimit")
    @ColumnInfo(name = "mc1MaxTxnLimit")
    private String mc1MaxTxnLimit;
    @SerializedName("mc2AlertMaxTxnLimit")
    @ColumnInfo(name = "mc2AlertMaxTxnLimit")
    private String mc2AlertMaxTxnLimit;
    @SerializedName("mc2CurrencyCode")
    @ColumnInfo(name = "mc2CurrencyCode")
    private String mc2CurrencyCode;
    @SerializedName("mc2CurrencyDP")
    @ColumnInfo(name = "mc2CurrencyDP")
    private String mc2CurrencyDP;
    @SerializedName("mc2CurrencyName")
    @ColumnInfo(name = "mc2CurrencyName")
    private String mc2CurrencyName;
    @SerializedName("mc2CurrencySymbol")
    @ColumnInfo(name = "mc2CurrencySymbol")
    private String mc2CurrencySymbol;
    @SerializedName("mc2MaxTxnLimit")
    @ColumnInfo(name = "mc2MaxTxnLimit")
    private String mc2MaxTxnLimit;
    @SerializedName("PasswordCashIn")
    @ColumnInfo(name = "PasswordCashIn")
    private String passwordCashIn;
    @SerializedName("PasswordCashOut")
    @ColumnInfo(name = "PasswordCashOut")
    private String passwordCashOut;
    @SerializedName("PasswordWallet")
    @ColumnInfo(name = "PasswordWallet")
    private String passwordWallet;
    @SerializedName("refundOffline")
    @ColumnInfo(name = "refundOffline")
    private String refundOffline;


    public String getRecordId() {
        return recordId;
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

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public int getDialogTimeOutAfterFinish() {
        return dialogTimeOutAfterFinish;
    }

    public void setDialogTimeOutAfterFinish(int dialogTimeOutAfterFinish) {
        this.dialogTimeOutAfterFinish = dialogTimeOutAfterFinish;
    }

    public boolean isEnableDialogAfterFinish() {
        return enableDialogAfterFinish;
    }

    public void setEnableDialogAfterFinish(boolean enableDialogAfterFinish) {
        this.enableDialogAfterFinish = enableDialogAfterFinish;
    }

    public boolean isDisablePrintingSettlementReport() {
        return disablePrintingSettlementReport;
    }

    public void setDisablePrintingSettlementReport(boolean disablePrintingSettlementReport) {
        this.disablePrintingSettlementReport = disablePrintingSettlementReport;
    }

    public String getAlertMaxTxnLimit() {
        return alertMaxTxnLimit;
    }

    public void setAlertMaxTxnLimit(String alertMaxTxnLimit) {
        this.alertMaxTxnLimit = alertMaxTxnLimit;
    }

    public boolean isBlockCashIn() {
        return blockCashIn;
    }

    public void setBlockCashIn(boolean blockCashIn) {
        this.blockCashIn = blockCashIn;
    }

    public boolean isBlockWallet() {
        return blockWallet;
    }

    public void setBlockWallet(boolean blockWallet) {
        this.blockWallet = blockWallet;
    }

    public boolean isEnableCashierProcessing() {
        return enableCashierProcessing;
    }

    public void setEnableCashierProcessing(boolean enableCashierProcessing) {
        this.enableCashierProcessing = enableCashierProcessing;
    }

    public boolean isEnablePasswordCashIn() {
        return enablePasswordCashIn;
    }

    public void setEnablePasswordCashIn(boolean enablePasswordCashIn) {
        this.enablePasswordCashIn = enablePasswordCashIn;
    }

    public boolean isEnablePasswordCashOut() {
        return enablePasswordCashOut;
    }

    public void setEnablePasswordCashOut(boolean enablePasswordCashOut) {
        this.enablePasswordCashOut = enablePasswordCashOut;
    }

    public boolean isEnablePasswordWallet() {
        return enablePasswordWallet;
    }

    public void setEnablePasswordWallet(boolean enablePasswordWallet) {
        this.enablePasswordWallet = enablePasswordWallet;
    }

    public String getForeignMinimumSurchargeAmount() {
        return foreignMinimumSurchargeAmount;
    }

    public void setForeignMinimumSurchargeAmount(String foreignMinimumSurchargeAmount) {
        this.foreignMinimumSurchargeAmount = foreignMinimumSurchargeAmount;
    }

    public String getLocalMinimumSurchargeAmount() {
        return localMinimumSurchargeAmount;
    }

    public void setLocalMinimumSurchargeAmount(String localMinimumSurchargeAmount) {
        this.localMinimumSurchargeAmount = localMinimumSurchargeAmount;
    }

    public String getMc1AlertMaxTxnLimit() {
        return mc1AlertMaxTxnLimit;
    }

    public void setMc1AlertMaxTxnLimit(String mc1AlertMaxTxnLimit) {
        this.mc1AlertMaxTxnLimit = mc1AlertMaxTxnLimit;
    }

    public String getMc1CurrencyCode() {
        return mc1CurrencyCode;
    }

    public void setMc1CurrencyCode(String mc1CurrencyCode) {
        this.mc1CurrencyCode = mc1CurrencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public boolean isBlockCashOut() {
        return blockCashOut;
    }

    public void setBlockCashOut(boolean blockCashOut) {
        this.blockCashOut = blockCashOut;
    }

    public String getMc1CurrencyDP() {
        return mc1CurrencyDP;
    }

    public void setMc1CurrencyDP(String mc1CurrencyDP) {
        this.mc1CurrencyDP = mc1CurrencyDP;
    }

    public String getMc1CurrencyName() {
        return mc1CurrencyName;
    }

    public void setMc1CurrencyName(String mc1CurrencyName) {
        this.mc1CurrencyName = mc1CurrencyName;
    }

    public String getMc1CurrencySymbol() {
        return mc1CurrencySymbol;
    }

    public void setMc1CurrencySymbol(String mc1CurrencySymbol) {
        this.mc1CurrencySymbol = mc1CurrencySymbol;
    }

    public String getMc1MaxTxnLimit() {
        return mc1MaxTxnLimit;
    }

    public void setMc1MaxTxnLimit(String mc1MaxTxnLimit) {
        this.mc1MaxTxnLimit = mc1MaxTxnLimit;
    }

    public String getMc2AlertMaxTxnLimit() {
        return mc2AlertMaxTxnLimit;
    }

    public void setMc2AlertMaxTxnLimit(String mc2AlertMaxTxnLimit) {
        this.mc2AlertMaxTxnLimit = mc2AlertMaxTxnLimit;
    }

    public String getMc2CurrencyCode() {
        return mc2CurrencyCode;
    }

    public void setMc2CurrencyCode(String mc2CurrencyCode) {
        this.mc2CurrencyCode = mc2CurrencyCode;
    }

    public String getMc2CurrencyDP() {
        return mc2CurrencyDP;
    }

    public void setMc2CurrencyDP(String mc2CurrencyDP) {
        this.mc2CurrencyDP = mc2CurrencyDP;
    }

    public String getMc2CurrencyName() {
        return mc2CurrencyName;
    }

    public void setMc2CurrencyName(String mc2CurrencyName) {
        this.mc2CurrencyName = mc2CurrencyName;
    }

    public String getMc2CurrencySymbol() {
        return mc2CurrencySymbol;
    }

    public void setMc2CurrencySymbol(String mc2CurrencySymbol) {
        this.mc2CurrencySymbol = mc2CurrencySymbol;
    }

    public String getMc2MaxTxnLimit() {
        return mc2MaxTxnLimit;
    }

    public void setMc2MaxTxnLimit(String mc2MaxTxnLimit) {
        this.mc2MaxTxnLimit = mc2MaxTxnLimit;
    }

    public String getPasswordCashIn() {
        return passwordCashIn;
    }

    public void setPasswordCashIn(String passwordCashIn) {
        this.passwordCashIn = passwordCashIn;
    }

    public String getPasswordCashOut() {
        return passwordCashOut;
    }

    public void setPasswordCashOut(String passwordCashOut) {
        this.passwordCashOut = passwordCashOut;
    }

    public String getPasswordWallet() {
        return passwordWallet;
    }

    public void setPasswordWallet(String passwordWallet) {
        this.passwordWallet = passwordWallet;
    }

    public String getRefundOffline() {
        return refundOffline;
    }

    public void setRefundOffline(String refundOffline) {
        this.refundOffline = refundOffline;
    }

    public int getTxtSettleAttempts() {
        return txtSettleAttempts;
    }

    public void setTxtSettleAttempts(int txtSettleAttempts) {
        this.txtSettleAttempts = txtSettleAttempts;
    }

    public boolean isEnablePrintEmvInfo() {
        return enablePrintEmvInfo;
    }

    public void setEnablePrintEmvInfo(boolean enablePrintEmvInfo) {
        this.enablePrintEmvInfo = enablePrintEmvInfo;
    }

    public boolean isEnableRpmClockInOut() {
        return enableRpmClockInOut;
    }

    public void setEnableRpmClockInOut(boolean enableRpmClockInOut) {
        this.enableRpmClockInOut = enableRpmClockInOut;
    }

    public boolean isEnableRpmHelpdeskReceipt() {
        return enableRpmHelpdeskReceipt;
    }

    public void setEnableRpmHelpdeskReceipt(boolean enableRpmHelpdeskReceipt) {
        this.enableRpmHelpdeskReceipt = enableRpmHelpdeskReceipt;
    }

    public boolean isEnableRpmWarningReceipt() {
        return enableRpmWarningReceipt;
    }

    public void setEnableRpmWarningReceipt(boolean enableRpmWarningReceipt) {
        this.enableRpmWarningReceipt = enableRpmWarningReceipt;
    }

    public boolean isEnableDccCompletion() {
        return enableDccCompletion;
    }

    public void setEnableDccCompletion(boolean enableDccCompletion) {
        this.enableDccCompletion = enableDccCompletion;
    }

    public boolean isEnableDccSale() {
        return enableDccSale;
    }

    public void setEnableDccSale(boolean enableDccSale) {
        this.enableDccSale = enableDccSale;
    }

    public boolean isEnableDccSaleOffline() {
        return enableDccSaleOffline;
    }

    public void setEnableDccSaleOffline(boolean enableDccSaleOffline) {
        this.enableDccSaleOffline = enableDccSaleOffline;
    }

    public boolean isEnableDccAuth() {
        return enableDccAuth;
    }

    public void setEnableDccAuth(boolean enableDccAuth) {
        this.enableDccAuth = enableDccAuth;
    }

    public boolean isEnableRpm() {
        return enableRpm;
    }

    public void setEnableRpm(boolean enableRpm) {
        this.enableRpm = enableRpm;
    }

    public int getTimeIntervalStsRequests() {
        return timeIntervalStsRequests;
    }

    public void setTimeIntervalStsRequests(int timeIntervalStsRequests) {
        this.timeIntervalStsRequests = timeIntervalStsRequests;
    }

    public boolean isEnableStsPayService() {
        return enableStsPayService;
    }

    public void setEnableStsPayService(boolean enableStsPayService) {
        this.enableStsPayService = enableStsPayService;
    }

    public boolean isVoidOffline() {
        return voidOffline;
    }

    public void setVoidOffline(boolean voidOffline) {
        this.voidOffline = voidOffline;
    }


    @Override
    public String toString() {
        return "TerminalApex{" +
               "HeaderL1='" + HeaderL1 + '\'' +
               ", HeaderL2='" + HeaderL2 + '\'' +
               ", HeaderL3='" + HeaderL3 + '\'' +
               ", HeaderL4='" + HeaderL4 + '\'' +
               ", HeaderL5='" + HeaderL5 + '\'' +
               ", FooterL1='" + FooterL1 + '\'' +
               ", FooterL2='" + FooterL2 + '\'' +
               ", FooterL3='" + FooterL3 + '\'' +
               ", FooterL4='" + FooterL4 + '\'' +
               ", FooterL5='" + FooterL5 + '\'' +
               ", passwordMaintenance='" + passwordMaintenance + '\'' +
               ", passwordMerchant='" + passwordMerchant + '\'' +
               ", EnablePasswordSale=" + EnablePasswordSale +
               ", EnablePasswordRefund=" + EnablePasswordRefund +
               ", EnablePasswordSettle=" + EnablePasswordSettle +
               ", EnablePasswordVoid=" + EnablePasswordVoid +
               ", EnablePasswordAuth=" + EnablePasswordAuth +
               ", EnablePasswordCompletion=" + EnablePasswordCompletion +
               ", EnablePasswordOffline=" + EnablePasswordOffline +
               ", EnablePasswordBalance=" + EnablePasswordBalance +
               ", EnablePasswordMoto=" + EnablePasswordMoto +
               ", EnablePasswordCash=" + EnablePasswordCash +
               ", EnablePasswordReload=" + EnablePasswordReload +
               ", EnablePasswordAdjust=" + EnablePasswordAdjust +
               ", EnablePasswordManual=" + EnablePasswordManual +
               ", EnablePasswordSaleQr=" + EnablePasswordSaleQr +
               ", EnablePasswordSalePromo=" + EnablePasswordSalePromo +
               ", EnablePasswordInstallment=" + EnablePasswordInstallment +
               ", EnablePasswordHotel=" + EnablePasswordHotel +
               ", EnablePasswordRefundQr=" + EnablePasswordRefundQr +
               ", CountryCode='" + CountryCode + '\'' +
               ", CurrencyCode='" + CurrencyCode + '\'' +
               ", CurrencySymbol='" + CurrencySymbol + '\'' +
               ", CurrencyDP='" + CurrencyDP + '\'' +
               ", maxTxnLimit='" + maxTxnLimit + '\'' +
               ", EmvTermCap='" + EmvTermCap + '\'' +
               ", EmvTermAddCap='" + EmvTermAddCap + '\'' +
               ", CtlsTermCap='" + CtlsTermCap + '\'' +
               ", CtlsTermAddCap='" + CtlsTermAddCap + '\'' +
               ", DisableChipFallback=" + DisableChipFallback +
               ", ChipFallbackCounter='" + ChipFallbackCounter + '\'' +
               ", surchargeAmount='" + surchargeAmount + '\'' +
               ", surchargePercentage1='" + surchargePercentage1 + '\'' +
               ", surchargePercentage2='" + surchargePercentage2 + '\'' +
               ", installmentMinAmount='" + installmentMinAmount + '\'' +
               ", SalaryCashOutFeePercentage1='" + SalaryCashOutFeePercentage1 + '\'' +
               ", SalaryCashOutFeePercentage2='" + SalaryCashOutFeePercentage2 + '\'' +
               ", EnablePreAuthCompletion=" + EnablePreAuthCompletion +
               ", PreAuthDays='" + PreAuthDays + '\'' +
               ", settleAttempts='" + settleAttempts + '\'' +
               ", settleTime='" + settleTime + '\'' +
               ", foreignSurchargeAmount='" + foreignSurchargeAmount + '\'' +
               ", foreignSurchargePercentage1='" + foreignSurchargePercentage1 + '\'' +
               ", foreignSurchargePercentage2='" + foreignSurchargePercentage2 + '\'' +
               ", defaultSurchargeForeign=" + defaultSurchargeForeign +
               ", enableTipProcessing=" + enableTipProcessing +
               ", disableTipPrompt=" + disableTipPrompt +
               ", enableTipAdjPromptTotal=" + enableTipAdjPromptTotal +
               ", tipPerc1='" + tipPerc1 + '\'' +
               ", tipPerc2='" + tipPerc2 + '\'' +
               ", tipPerc3='" + tipPerc3 + '\'' +
               ", tipPerc4='" + tipPerc4 + '\'' +
               ", maxTipPercentage='" + maxTipPercentage + '\'' +
               ", enableMobileWallet=" + enableMobileWallet +
               ", enableMobileCashIn=" + enableMobileCashIn +
               ", enableMobileCashOut=" + enableMobileCashOut +
               ", enableMobileCashSale=" + enableMobileCashSale +
               ", enableWalletCashInPassword=" + enableWalletCashInPassword +
               ", enableWalletCashOutPassword=" + enableWalletCashOutPassword +
               ", enableWalletSalePassword=" + enableWalletSalePassword +
               ", mobileWalletPassword='" + mobileWalletPassword + '\'' +
               ", mobilePhonePrefix='" + mobilePhonePrefix + '\'' +
               ", mobilePhoneMinLen='" + mobilePhoneMinLen + '\'' +
               ", mobilePhoneMaxLen='" + mobilePhoneMaxLen + '\'' +
               ", enableApexEcr=" + enableApexEcr +
               ", blockWifi=" + blockWifi +
               ", apnWhiteList='" + apnWhiteList + '\'' +
               ", qrMpayFeeAmount='" + qrMpayFeeAmount + '\'' +
               ", qrMpayFeePercentage1='" + qrMpayFeePercentage1 + '\'' +
               ", qrMpayFeePercentage2='" + qrMpayFeePercentage2 + '\'' +
               ", qrMpayMaxAmount='" + qrMpayMaxAmount + '\'' +
               ", ecrComPortConfig='" + ecrComPortConfig + '\'' +
               ", enableEcrUsb=" + enableEcrUsb +
               ", enableEcrOnly=" + enableEcrOnly +
               ", enablePosPrintReceiptEcr=" + enablePosPrintReceiptEcr +
               ", enableEcrRs232=" + enableEcrRs232 +
               ", enableMceProcessing=" + enableMceProcessing +
               ", screenSaverTimeout=" + screenSaverTimeout +
               ", screenSaverImageInterval='" + screenSaverImageInterval + '\'' +
               ", terminalRestartTime='" + terminalRestartTime + '\'' +
               ", disableTextToSpeack=" + disableTextToSpeack +
               ", disableRpmHeartbeat=" + disableRpmHeartbeat +
               ", enableDozeMode=" + enableDozeMode +
               ", PasswordSale='" + PasswordSale + '\'' +
               ", PasswordRefund='" + PasswordRefund + '\'' +
               ", PasswordSettle='" + PasswordSettle + '\'' +
               ", PasswordVoid='" + PasswordVoid + '\'' +
               ", PasswordAuth='" + PasswordAuth + '\'' +
               ", PasswordCompletion='" + PasswordCompletion + '\'' +
               ", PasswordOffline='" + PasswordOffline + '\'' +
               ", PasswordBalance='" + PasswordBalance + '\'' +
               ", PasswordMoto='" + PasswordMoto + '\'' +
               ", PasswordCash='" + PasswordCash + '\'' +
               ", PasswordReload='" + PasswordReload + '\'' +
               ", PasswordAdjust='" + PasswordAdjust + '\'' +
               ", PasswordManual='" + PasswordManual + '\'' +
               ", PasswordSaleQr='" + PasswordSaleQr + '\'' +
               ", PasswordSalePromo='" + PasswordSalePromo + '\'' +
               ", PasswordInstallment='" + PasswordInstallment + '\'' +
               ", PasswordHotel='" + PasswordHotel + '\'' +
               ", PasswordRefundQr='" + PasswordRefundQr + '\'' +
               ", BlockSale=" + BlockSale +
               ", BlockRefund=" + BlockRefund +
               ", BlockSettle=" + BlockSettle +
               ", BlockVoid=" + BlockVoid +
               ", BlockAuth=" + BlockAuth +
               ", BlockCompletion=" + BlockCompletion +
               ", BlockOffline=" + BlockOffline +
               ", BlockBalance=" + BlockBalance +
               ", BlockMoto=" + BlockMoto +
               ", BlockCash=" + BlockCash +
               ", BlockReload=" + BlockReload +
               ", BlockAdjust=" + BlockAdjust +
               ", BlockManual=" + BlockManual +
               ", BlockSaleQr=" + BlockSaleQr +
               ", BlockSalePromo=" + BlockSalePromo +
               ", BlockInstallment=" + BlockInstallment +
               ", BlockHotel=" + BlockHotel +
               ", BlockRefundQr=" + BlockRefundQr +
               ", enableRpmReceipt=" + enableRpmReceipt +
               ", voidOffline=" + voidOffline +
               ", enableStsPayService=" + enableStsPayService +
               ", enableRpm=" + enableRpm +
               ", timeIntervalStsRequests=" + timeIntervalStsRequests +
               ", enableRpmReceiptChannels=" + enableRpmReceiptChannels +
               ", checkCountryCode=" + checkCountryCode +
               ", enableCtlsDcc=" + enableCtlsDcc +
               ", enableDccAuth=" + enableDccAuth +
               ", enableDccCompletion=" + enableDccCompletion +
               ", enableDccSale=" + enableDccSale +
               ", enableDccSaleOffline=" + enableDccSaleOffline +
               ", enablePrintEmvInfo=" + enablePrintEmvInfo +
               ", enableRpmClockInOut=" + enableRpmClockInOut +
               ", enableRpmHelpdeskReceipt=" + enableRpmHelpdeskReceipt +
               ", enableRpmWarningReceipt=" + enableRpmWarningReceipt +
               ", disablePrintingSettlementReport=" + disablePrintingSettlementReport +
               ", txtSettleAttempts=" + txtSettleAttempts +
               ", dialogTimeOutAfterFinish=" + dialogTimeOutAfterFinish +
               ", enableDialogAfterFinish=" + enableDialogAfterFinish +
               '}';
    }

    public String getHeaderL1() {
        return HeaderL1;
    }

    public void setHeaderL1(String headerL1) {
        HeaderL1 = headerL1;
    }

    public String getHeaderL2() {
        return HeaderL2;
    }

    public void setHeaderL2(String headerL2) {
        HeaderL2 = headerL2;
    }

    public String getHeaderL3() {
        return HeaderL3;
    }

    public void setHeaderL3(String headerL3) {
        HeaderL3 = headerL3;
    }

    public String getHeaderL4() {
        return HeaderL4;
    }

    public void setHeaderL4(String headerL4) {
        HeaderL4 = headerL4;
    }

    public String getHeaderL5() {
        return HeaderL5;
    }

    public void setHeaderL5(String headerL5) {
        HeaderL5 = headerL5;
    }

    public String getFooterL1() {
        return FooterL1;
    }

    public void setFooterL1(String footerL1) {
        FooterL1 = footerL1;
    }

    public String getFooterL2() {
        return FooterL2;
    }

    public void setFooterL2(String footerL2) {
        FooterL2 = footerL2;
    }

    public String getFooterL3() {
        return FooterL3;
    }

    public void setFooterL3(String footerL3) {
        FooterL3 = footerL3;
    }

    public String getFooterL4() {
        return FooterL4;
    }

    public void setFooterL4(String footerL4) {
        FooterL4 = footerL4;
    }

    public String getFooterL5() {
        return FooterL5;
    }

    public void setFooterL5(String footerL5) {
        FooterL5 = footerL5;
    }

    public String getPasswordMaintenance() {
        return passwordMaintenance;
    }

    public void setPasswordMaintenance(String passwordMaintenance) {
        this.passwordMaintenance = passwordMaintenance;
    }

    public String getPasswordMerchant() {
        return passwordMerchant;
    }

    public void setPasswordMerchant(String passwordMerchant) {
        this.passwordMerchant = passwordMerchant;
    }

    public boolean isEnablePasswordSale() {
        return EnablePasswordSale;
    }

    public void setEnablePasswordSale(boolean enablePasswordSale) {
        EnablePasswordSale = enablePasswordSale;
    }

    public boolean isEnablePasswordRefund() {
        return EnablePasswordRefund;
    }

    public void setEnablePasswordRefund(boolean enablePasswordRefund) {
        EnablePasswordRefund = enablePasswordRefund;
    }

    public boolean isEnablePasswordSettle() {
        return EnablePasswordSettle;
    }

    public void setEnablePasswordSettle(boolean enablePasswordSettle) {
        EnablePasswordSettle = enablePasswordSettle;
    }

    public boolean isEnablePasswordVoid() {
        return EnablePasswordVoid;
    }

    public void setEnablePasswordVoid(boolean enablePasswordVoid) {
        EnablePasswordVoid = enablePasswordVoid;
    }

    public boolean isEnablePasswordAuth() {
        return EnablePasswordAuth;
    }

    public void setEnablePasswordAuth(boolean enablePasswordAuth) {
        EnablePasswordAuth = enablePasswordAuth;
    }

    public boolean isEnablePasswordCompletion() {
        return EnablePasswordCompletion;
    }

    public void setEnablePasswordCompletion(boolean enablePasswordCompletion) {
        EnablePasswordCompletion = enablePasswordCompletion;
    }

    public boolean isEnablePasswordOffline() {
        return EnablePasswordOffline;
    }

    public void setEnablePasswordOffline(boolean enablePasswordOffline) {
        EnablePasswordOffline = enablePasswordOffline;
    }

    public boolean isEnablePasswordBalance() {
        return EnablePasswordBalance;
    }

    public void setEnablePasswordBalance(boolean enablePasswordBalance) {
        EnablePasswordBalance = enablePasswordBalance;
    }

    public boolean isEnablePasswordMoto() {
        return EnablePasswordMoto;
    }

    public void setEnablePasswordMoto(boolean enablePasswordMoto) {
        EnablePasswordMoto = enablePasswordMoto;
    }

    public boolean isEnablePasswordCash() {
        return EnablePasswordCash;
    }

    public void setEnablePasswordCash(boolean enablePasswordCash) {
        EnablePasswordCash = enablePasswordCash;
    }

    public boolean isEnablePasswordReload() {
        return EnablePasswordReload;
    }

    public void setEnablePasswordReload(boolean enablePasswordReload) {
        EnablePasswordReload = enablePasswordReload;
    }

    public boolean isEnablePasswordAdjust() {
        return EnablePasswordAdjust;
    }

    public void setEnablePasswordAdjust(boolean enablePasswordAdjust) {
        EnablePasswordAdjust = enablePasswordAdjust;
    }

    public boolean isEnablePasswordManual() {
        return EnablePasswordManual;
    }

    public void setEnablePasswordManual(boolean enablePasswordManual) {
        EnablePasswordManual = enablePasswordManual;
    }

    public boolean isEnablePasswordSaleQr() {
        return EnablePasswordSaleQr;
    }

    public void setEnablePasswordSaleQr(boolean enablePasswordSaleQr) {
        EnablePasswordSaleQr = enablePasswordSaleQr;
    }

    public boolean isEnablePasswordSalePromo() {
        return EnablePasswordSalePromo;
    }

    public void setEnablePasswordSalePromo(boolean enablePasswordSalePromo) {
        EnablePasswordSalePromo = enablePasswordSalePromo;
    }

    public boolean isEnablePasswordInstallment() {
        return EnablePasswordInstallment;
    }

    public void setEnablePasswordInstallment(boolean enablePasswordInstallment) {
        EnablePasswordInstallment = enablePasswordInstallment;
    }

    public boolean isEnablePasswordHotel() {
        return EnablePasswordHotel;
    }

    public void setEnablePasswordHotel(boolean enablePasswordHotel) {
        EnablePasswordHotel = enablePasswordHotel;
    }

    public boolean isEnablePasswordRefundQr() {
        return EnablePasswordRefundQr;
    }

    public void setEnablePasswordRefundQr(boolean enablePasswordRefundQr) {
        EnablePasswordRefundQr = enablePasswordRefundQr;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getCurrencySymbol() {
        return CurrencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        CurrencySymbol = currencySymbol;
    }

    public String getCurrencyDP() {
        return CurrencyDP;
    }

    public void setCurrencyDP(String currencyDP) {
        CurrencyDP = currencyDP;
    }

    public String getMaxTxnLimit() {
        return maxTxnLimit;
    }

    public void setMaxTxnLimit(String maxTxnLimit) {
        this.maxTxnLimit = maxTxnLimit;
    }

    public String getEmvTermCap() {
        return EmvTermCap;
    }

    public void setEmvTermCap(String emvTermCap) {
        EmvTermCap = emvTermCap;
    }

    public String getEmvTermAddCap() {
        return EmvTermAddCap;
    }

    public void setEmvTermAddCap(String emvTermAddCap) {
        EmvTermAddCap = emvTermAddCap;
    }


    public String getCtlsTermCap() {
        return CtlsTermCap;
    }

    public void setCtlsTermCap(String ctlsTermCap) {
        CtlsTermCap = ctlsTermCap;
    }

    public String getCtlsTermAddCap() {
        return CtlsTermAddCap;
    }

    public void setCtlsTermAddCap(String ctlsTermAddCap) {
        CtlsTermAddCap = ctlsTermAddCap;
    }

    public boolean isDisableChipFallback() {
        return DisableChipFallback;
    }

    public void setDisableChipFallback(boolean disableChipFallback) {
        DisableChipFallback = disableChipFallback;
    }

    public String getChipFallbackCounter() {
        return ChipFallbackCounter;
    }

    public void setChipFallbackCounter(String chipFallbackCounter) {
        ChipFallbackCounter = chipFallbackCounter;
    }

    public String getSurchargeAmount() {
        return surchargeAmount;
    }

    public void setSurchargeAmount(String surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }

    public String getSurchargePercentage1() {
        return surchargePercentage1;
    }

    public void setSurchargePercentage1(String surchargePercentage1) {
        this.surchargePercentage1 = surchargePercentage1;
    }

    public String getSurchargePercentage2() {
        return surchargePercentage2;
    }

    public void setSurchargePercentage2(String surchargePercentage2) {
        this.surchargePercentage2 = surchargePercentage2;
    }

    public String getInstallmentMinAmount() {
        return installmentMinAmount;
    }

    public void setInstallmentMinAmount(String installmentMinAmount) {
        this.installmentMinAmount = installmentMinAmount;
    }

    public String getSalaryCashOutFeePercentage1() {
        return SalaryCashOutFeePercentage1;
    }

    public void setSalaryCashOutFeePercentage1(String salaryCashOutFeePercentage1) {
        SalaryCashOutFeePercentage1 = salaryCashOutFeePercentage1;
    }

    public String getSalaryCashOutFeePercentage2() {
        return SalaryCashOutFeePercentage2;
    }

    public void setSalaryCashOutFeePercentage2(String salaryCashOutFeePercentage2) {
        SalaryCashOutFeePercentage2 = salaryCashOutFeePercentage2;
    }

    public boolean isEnablePreAuthCompletion() {
        return EnablePreAuthCompletion;
    }

    public void setEnablePreAuthCompletion(boolean enablePreAuthCompletion) {
        EnablePreAuthCompletion = enablePreAuthCompletion;
    }

    public String getPreAuthDays() {
        return PreAuthDays;
    }

    public void setPreAuthDays(String preAuthDays) {
        PreAuthDays = preAuthDays;
    }

    public String getSettleAttempts() {
        return settleAttempts;
    }

    public void setSettleAttempts(String settleAttempts) {
        this.settleAttempts = settleAttempts;
    }

    public String getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime;
    }

    public String getForeignSurchargeAmount() {
        return foreignSurchargeAmount;
    }

    public void setForeignSurchargeAmount(String foreignSurchargeAmount) {
        this.foreignSurchargeAmount = foreignSurchargeAmount;
    }

    public String getForeignSurchargePercentage1() {
        return foreignSurchargePercentage1;
    }

    public void setForeignSurchargePercentage1(String foreignSurchargePercentage1) {
        this.foreignSurchargePercentage1 = foreignSurchargePercentage1;
    }

    public String getForeignSurchargePercentage2() {
        return foreignSurchargePercentage2;
    }

    public void setForeignSurchargePercentage2(String foreignSurchargePercentage2) {
        this.foreignSurchargePercentage2 = foreignSurchargePercentage2;
    }

    public boolean isDefaultSurchargeForeign() {
        return defaultSurchargeForeign;
    }

    public void setDefaultSurchargeForeign(boolean defaultSurchargeForeign) {
        this.defaultSurchargeForeign = defaultSurchargeForeign;
    }

    public boolean isEnableTipProcessing() {
        return enableTipProcessing;
    }

    public void setEnableTipProcessing(boolean enableTipProcessing) {
        this.enableTipProcessing = enableTipProcessing;
    }

    public boolean isDisableTipPrompt() {
        return disableTipPrompt;
    }

    public void setDisableTipPrompt(boolean disableTipPrompt) {
        this.disableTipPrompt = disableTipPrompt;
    }

    public boolean isEnableTipAdjPromptTotal() {
        return enableTipAdjPromptTotal;
    }

    public void setEnableTipAdjPromptTotal(boolean enableTipAdjPromptTotal) {
        this.enableTipAdjPromptTotal = enableTipAdjPromptTotal;
    }

    public String getTipPerc1() {
        return tipPerc1;
    }

    public void setTipPerc1(String tipPerc1) {
        this.tipPerc1 = tipPerc1;
    }

    public String getTipPerc2() {
        return tipPerc2;
    }

    public void setTipPerc2(String tipPerc2) {
        this.tipPerc2 = tipPerc2;
    }

    public String getTipPerc3() {
        return tipPerc3;
    }

    public void setTipPerc3(String tipPerc3) {
        this.tipPerc3 = tipPerc3;
    }

    public String getTipPerc4() {
        return tipPerc4;
    }

    public void setTipPerc4(String tipPerc4) {
        this.tipPerc4 = tipPerc4;
    }

    public String getMaxTipPercentage() {
        return maxTipPercentage;
    }

    public void setMaxTipPercentage(String maxTipPercentage) {
        this.maxTipPercentage = maxTipPercentage;
    }

    public boolean isEnableMobileWallet() {
        return enableMobileWallet;
    }

    public void setEnableMobileWallet(boolean enableMobileWallet) {
        this.enableMobileWallet = enableMobileWallet;
    }

    public boolean isEnableMobileCashIn() {
        return enableMobileCashIn;
    }

    public void setEnableMobileCashIn(boolean enableMobileCashIn) {
        this.enableMobileCashIn = enableMobileCashIn;
    }

    public boolean isEnableMobileCashOut() {
        return enableMobileCashOut;
    }

    public void setEnableMobileCashOut(boolean enableMobileCashOut) {
        this.enableMobileCashOut = enableMobileCashOut;
    }

    public boolean isEnableMobileCashSale() {
        return enableMobileCashSale;
    }

    public void setEnableMobileCashSale(boolean enableMobileCashSale) {
        this.enableMobileCashSale = enableMobileCashSale;
    }

    public boolean isEnableWalletCashInPassword() {
        return enableWalletCashInPassword;
    }

    public void setEnableWalletCashInPassword(boolean enableWalletCashInPassword) {
        this.enableWalletCashInPassword = enableWalletCashInPassword;
    }

    public boolean isEnableWalletCashOutPassword() {
        return enableWalletCashOutPassword;
    }

    public void setEnableWalletCashOutPassword(boolean enableWalletCashOutPassword) {
        this.enableWalletCashOutPassword = enableWalletCashOutPassword;
    }

    public boolean isEnableWalletSalePassword() {
        return enableWalletSalePassword;
    }

    public void setEnableWalletSalePassword(boolean enableWalletSalePassword) {
        this.enableWalletSalePassword = enableWalletSalePassword;
    }

    public String getMobileWalletPassword() {
        return mobileWalletPassword;
    }

    public void setMobileWalletPassword(String mobileWalletPassword) {
        this.mobileWalletPassword = mobileWalletPassword;
    }

    public String getMobilePhonePrefix() {
        return mobilePhonePrefix;
    }

    public void setMobilePhonePrefix(String mobilePhonePrefix) {
        this.mobilePhonePrefix = mobilePhonePrefix;
    }

    public String getMobilePhoneMinLen() {
        return mobilePhoneMinLen;
    }

    public void setMobilePhoneMinLen(String mobilePhoneMinLen) {
        this.mobilePhoneMinLen = mobilePhoneMinLen;
    }

    public String getMobilePhoneMaxLen() {
        return mobilePhoneMaxLen;
    }

    public void setMobilePhoneMaxLen(String mobilePhoneMaxLen) {
        this.mobilePhoneMaxLen = mobilePhoneMaxLen;
    }

    public boolean isEnableApexEcr() {
        return enableApexEcr;
    }

    public void setEnableApexEcr(boolean enableApexEcr) {
        this.enableApexEcr = enableApexEcr;
    }

    public boolean isBlockWifi() {
        return blockWifi;
    }

    public void setBlockWifi(boolean blockWifi) {
        this.blockWifi = blockWifi;
    }

    public String getApnWhiteList() {
        return apnWhiteList;
    }

    public void setApnWhiteList(String apnWhiteList) {
        this.apnWhiteList = apnWhiteList;
    }

    public String getQrMpayFeeAmount() {
        return qrMpayFeeAmount;
    }

    public void setQrMpayFeeAmount(String qrMpayFeeAmount) {
        this.qrMpayFeeAmount = qrMpayFeeAmount;
    }

    public String getQrMpayFeePercentage1() {
        return qrMpayFeePercentage1;
    }

    public void setQrMpayFeePercentage1(String qrMpayFeePercentage1) {
        this.qrMpayFeePercentage1 = qrMpayFeePercentage1;
    }

    public String getQrMpayFeePercentage2() {
        return qrMpayFeePercentage2;
    }

    public void setQrMpayFeePercentage2(String qrMpayFeePercentage2) {
        this.qrMpayFeePercentage2 = qrMpayFeePercentage2;
    }

    public String getQrMpayMaxAmount() {
        return qrMpayMaxAmount;
    }

    public void setQrMpayMaxAmount(String qrMpayMaxAmount) {
        this.qrMpayMaxAmount = qrMpayMaxAmount;
    }

    public String getEcrComPortConfig() {
        return ecrComPortConfig;
    }

    public void setEcrComPortConfig(String ecrComPortConfig) {
        this.ecrComPortConfig = ecrComPortConfig;
    }

    public boolean isEnableEcrUsb() {
        return enableEcrUsb;
    }

    public void setEnableEcrUsb(boolean enableEcrUsb) {
        this.enableEcrUsb = enableEcrUsb;
    }

    public boolean isEnableEcrOnly() {
        return enableEcrOnly;
    }

    public void setEnableEcrOnly(boolean enableEcrOnly) {
        this.enableEcrOnly = enableEcrOnly;
    }

    public boolean isEnablePosPrintReceiptEcr() {
        return enablePosPrintReceiptEcr;
    }

    public void setEnablePosPrintReceiptEcr(boolean enablePosPrintReceiptEcr) {
        this.enablePosPrintReceiptEcr = enablePosPrintReceiptEcr;
    }

    public boolean isEnableEcrRs232() {
        return enableEcrRs232;
    }

    public void setEnableEcrRs232(boolean enableEcrRs232) {
        this.enableEcrRs232 = enableEcrRs232;
    }

    public boolean isEnableMceProcessing() {
        return enableMceProcessing;
    }

    public void setEnableMceProcessing(boolean enableMceProcessing) {
        this.enableMceProcessing = enableMceProcessing;
    }


    public int getScreenSaverTimeout() {
        return screenSaverTimeout;
    }

    public void setScreenSaverTimeout(int screenSaverTimeout) {
        this.screenSaverTimeout = screenSaverTimeout;
    }

    public String getScreenSaverImageInterval() {
        return screenSaverImageInterval;
    }

    public void setScreenSaverImageInterval(String screenSaverImageInterval) {
        this.screenSaverImageInterval = screenSaverImageInterval;
    }

    public String getTerminalRestartTime() {
        return terminalRestartTime;
    }

    public void setTerminalRestartTime(String terminalRestartTime) {
        this.terminalRestartTime = terminalRestartTime;
    }

    public boolean isDisableTextToSpeack() {
        return disableTextToSpeack;
    }

    public void setDisableTextToSpeack(boolean disableTextToSpeack) {
        this.disableTextToSpeack = disableTextToSpeack;
    }

    public boolean isDisableRpmHeartbeat() {
        return disableRpmHeartbeat;
    }

    public void setDisableRpmHeartbeat(boolean disableRpmHeartbeat) {
        this.disableRpmHeartbeat = disableRpmHeartbeat;
    }

    public boolean isEnableDozeMode() {
        return enableDozeMode;
    }

    public void setEnableDozeMode(boolean enableDozeMode) {
        this.enableDozeMode = enableDozeMode;
    }

    public String getPasswordSale() {
        return PasswordSale;
    }

    public void setPasswordSale(String passwordSale) {
        PasswordSale = passwordSale;
    }

    public String getPasswordRefund() {
        return PasswordRefund;
    }

    public void setPasswordRefund(String passwordRefund) {
        PasswordRefund = passwordRefund;
    }

    public String getPasswordSettle() {
        return PasswordSettle;
    }

    public void setPasswordSettle(String passwordSettle) {
        PasswordSettle = passwordSettle;
    }

    public String getPasswordVoid() {
        return PasswordVoid;
    }

    public void setPasswordVoid(String passwordVoid) {
        PasswordVoid = passwordVoid;
    }

    public String getPasswordAuth() {
        return PasswordAuth;
    }

    public void setPasswordAuth(String passwordAuth) {
        PasswordAuth = passwordAuth;
    }

    public String getPasswordCompletion() {
        return PasswordCompletion;
    }

    public void setPasswordCompletion(String passwordCompletion) {
        PasswordCompletion = passwordCompletion;
    }

    public String getPasswordOffline() {
        return PasswordOffline;
    }

    public void setPasswordOffline(String passwordOffline) {
        PasswordOffline = passwordOffline;
    }

    public String getPasswordBalance() {
        return PasswordBalance;
    }

    public void setPasswordBalance(String passwordBalance) {
        PasswordBalance = passwordBalance;
    }

    public String getPasswordMoto() {
        return PasswordMoto;
    }

    public void setPasswordMoto(String passwordMoto) {
        PasswordMoto = passwordMoto;
    }

    public String getPasswordCash() {
        return PasswordCash;
    }

    public void setPasswordCash(String passwordCash) {
        PasswordCash = passwordCash;
    }

    public String getPasswordReload() {
        return PasswordReload;
    }

    public void setPasswordReload(String passwordReload) {
        PasswordReload = passwordReload;
    }

    public String getPasswordAdjust() {
        return PasswordAdjust;
    }

    public void setPasswordAdjust(String passwordAdjust) {
        PasswordAdjust = passwordAdjust;
    }

    public String getPasswordManual() {
        return PasswordManual;
    }

    public void setPasswordManual(String passwordManual) {
        PasswordManual = passwordManual;
    }

    public String getPasswordSaleQr() {
        return PasswordSaleQr;
    }

    public void setPasswordSaleQr(String passwordSaleQr) {
        PasswordSaleQr = passwordSaleQr;
    }

    public String getPasswordSalePromo() {
        return PasswordSalePromo;
    }

    public void setPasswordSalePromo(String passwordSalePromo) {
        PasswordSalePromo = passwordSalePromo;
    }

    public String getPasswordInstallment() {
        return PasswordInstallment;
    }

    public void setPasswordInstallment(String passwordInstallment) {
        PasswordInstallment = passwordInstallment;
    }

    public String getPasswordHotel() {
        return PasswordHotel;
    }

    public void setPasswordHotel(String passwordHotel) {
        PasswordHotel = passwordHotel;
    }

    public String getPasswordRefundQr() {
        return PasswordRefundQr;
    }

    public void setPasswordRefundQr(String passwordRefundQr) {
        PasswordRefundQr = passwordRefundQr;
    }

    public boolean isBlockSale() {
        return BlockSale;
    }

    public void setBlockSale(boolean blockSale) {
        BlockSale = blockSale;
    }

    public boolean isBlockRefund() {
        return BlockRefund;
    }

    public void setBlockRefund(boolean blockRefund) {
        BlockRefund = blockRefund;
    }

    public boolean isBlockSettle() {
        return BlockSettle;
    }

    public void setBlockSettle(boolean blockSettle) {
        BlockSettle = blockSettle;
    }

    public boolean isBlockVoid() {
        return BlockVoid;
    }

    public void setBlockVoid(boolean blockVoid) {
        BlockVoid = blockVoid;
    }

    public boolean isBlockAuth() {
        return BlockAuth;
    }

    public void setBlockAuth(boolean blockAuth) {
        BlockAuth = blockAuth;
    }

    public boolean isBlockCompletion() {
        return BlockCompletion;
    }

    public void setBlockCompletion(boolean blockCompletion) {
        BlockCompletion = blockCompletion;
    }

    public boolean isBlockOffline() {
        return BlockOffline;
    }

    public void setBlockOffline(boolean blockOffline) {
        BlockOffline = blockOffline;
    }

    public boolean isBlockBalance() {
        return BlockBalance;
    }

    public void setBlockBalance(boolean blockBalance) {
        BlockBalance = blockBalance;
    }

    public boolean isBlockMoto() {
        return BlockMoto;
    }

    public void setBlockMoto(boolean blockMoto) {
        BlockMoto = blockMoto;
    }

    public boolean isBlockCash() {
        return BlockCash;
    }

    public void setBlockCash(boolean blockCash) {
        BlockCash = blockCash;
    }

    public boolean isBlockReload() {
        return BlockReload;
    }

    public void setBlockReload(boolean blockReload) {
        BlockReload = blockReload;
    }

    public boolean isBlockAdjust() {
        return BlockAdjust;
    }

    public void setBlockAdjust(boolean blockAdjust) {
        BlockAdjust = blockAdjust;
    }

    public boolean isBlockManual() {
        return BlockManual;
    }

    public void setBlockManual(boolean blockManual) {
        BlockManual = blockManual;
    }

    public boolean isBlockSaleQr() {
        return BlockSaleQr;
    }

    public void setBlockSaleQr(boolean blockSaleQr) {
        BlockSaleQr = blockSaleQr;
    }

    public boolean isBlockSalePromo() {
        return BlockSalePromo;
    }

    public void setBlockSalePromo(boolean blockSalePromo) {
        BlockSalePromo = blockSalePromo;
    }

    public boolean isBlockInstallment() {
        return BlockInstallment;
    }

    public void setBlockInstallment(boolean blockInstallment) {
        BlockInstallment = blockInstallment;
    }

    public boolean isBlockHotel() {
        return BlockHotel;
    }

    public void setBlockHotel(boolean blockHotel) {
        BlockHotel = blockHotel;
    }

    public boolean isBlockRefundQr() {
        return BlockRefundQr;
    }

    public void setBlockRefundQr(boolean blockRefundQr) {
        BlockRefundQr = blockRefundQr;
    }

    public boolean isEnableRpmReceipt() {
        return enableRpmReceipt;
    }

    public void setEnableRpmReceipt(boolean enableRpmReceipt) {
        this.enableRpmReceipt = enableRpmReceipt;
    }


    public boolean isEnableCtlsDcc() {
        return enableCtlsDcc;
    }

    public void setEnableCtlsDcc(boolean enableCtlsDcc) {
        this.enableCtlsDcc = enableCtlsDcc;
    }

    public boolean isCheckCountryCode() {
        return checkCountryCode;
    }

    public void setCheckCountryCode(boolean checkCountryCode) {
        this.checkCountryCode = checkCountryCode;
    }

    public boolean isEnableRpmReceiptChannels() {
        return enableRpmReceiptChannels;
    }

    public void setEnableRpmReceiptChannels(boolean enableRpmReceiptChannels) {
        this.enableRpmReceiptChannels = enableRpmReceiptChannels;
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
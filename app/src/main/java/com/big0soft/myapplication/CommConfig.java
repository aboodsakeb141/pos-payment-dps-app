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
 * Room entity for Communication Configuration data
 * Table name: comm_config
 * Has a foreign key relationship with AcquirerEntity
 */
@Entity(
        tableName = AppDatabase.RoomConstants.COMM_CONFIG_TABLE_NAME,
        foreignKeys = {@ForeignKey(
                entity = AcquirerApex.class,
                parentColumns = "record_id",
                childColumns = "acquirer_id",
                onDelete = ForeignKey.CASCADE
        ), @ForeignKey(
                entity = TerminalApex.class,
                parentColumns = "record_id",
                childColumns = "terminal_id",
                onDelete = ForeignKey.CASCADE
        )},
        indices = {@Index("acquirer_id"),@Index("terminal_id")}
)
public class CommConfig implements TmsTagInfo, Serializable, TmsRecordValidation, Mapping2TagValue {

    private static final long serialVersionUID = 2669293150219020249L;
    @SerializedName("Terminal1.record_id")
    @ColumnInfo(name = "terminal_id")
    private String terminalId;
    @SerializedName("InstallmentNii")
    @ColumnInfo(name = "InstallmentNii")
    private String installmentNii;
    @SerializedName("InstallmentRecvTo")
    @ColumnInfo(name = "InstallmentRecvTo")
    private String installmentRecvTo;
    @SerializedName("InstallmentSendTo")
    @ColumnInfo(name = "InstallmentSendTo")
    private String installmentSendTo;
    @SerializedName("CliqUrl")
    @ColumnInfo(name = "CliqUrl")
    private String cliqUrl;
    @SerializedName("DccConnTo")
    @ColumnInfo(name = "DccConnTo")
    private String dccConnTo;
    @SerializedName("DccEnableSSL")
    @ColumnInfo(name = "DccEnableSSL")
    private String dccEnableSSL;
    @SerializedName("DccEnableSSLServerAuth")
    @ColumnInfo(name = "DccEnableSSLServerAuth")
    private String dccEnableSSLServerAuth;
    @SerializedName("DccHeaderLength")
    @ColumnInfo(name = "DccHeaderLength")
    private String dccHeaderLength;
    @SerializedName("DccHeaderTPDU")
    @ColumnInfo(name = "DccHeaderTPDU")
    private String dccHeaderTPDU;
    @SerializedName("DccIpAdd")
    @ColumnInfo(name = "DccIpAdd")
    private String dccIpAdd;
    @SerializedName("DccNii")
    @ColumnInfo(name = "DccNii")
    private String dccNii;
    @SerializedName("DccRecvTo")
    @ColumnInfo(name = "DccRecvTo")
    private String dccRecvTo;
    @SerializedName("DccSendTo")
    @ColumnInfo(name = "DccSendTo")
    private String dccSendTo;
    @SerializedName("DccTcpPort")
    @ColumnInfo(name = "DccTcpPort")
    private String dccTcpPort;
    @SerializedName("HostConnTo")
    @ColumnInfo(name = "HostConnTo")
    private String hostConnTo;
    @SerializedName("HostEnableSSL")
    @ColumnInfo(name = "HostEnableSSL")
    private String hostEnableSSL;
    @SerializedName("HostEnableSSLServerAuth")
    @ColumnInfo(name = "HostEnableSSLServerAuth")
    private String hostEnableSSLServerAuth;
    @SerializedName("HostHeaderLength")
    @ColumnInfo(name = "HostHeaderLength")
    private String hostHeaderLength;
    @SerializedName("HostHeaderTPDU")
    @ColumnInfo(name = "HostHeaderTPDU")
    private String hostHeaderTPDU;
    @SerializedName("HostIpAdd")
    @ColumnInfo(name = "HostIpAdd")
    private String hostIpAdd;
    @SerializedName("HostNii")
    @ColumnInfo(name = "HostNii")
    private String hostNii;
    @SerializedName("HostRecvTo")
    @ColumnInfo(name = "HostRecvTo")
    private String hostRecvTo;
    @SerializedName("HostSendTo")
    @ColumnInfo(name = "HostSendTo")
    private String hostSendTo;
    @SerializedName("HostTcpPort")
    @ColumnInfo(name = "HostTcpPort")
    private String hostTcpPort;
    @SerializedName("InstallmentConnTo")
    @ColumnInfo(name = "InstallmentConnTo")
    private String installmentConnTo;
    @SerializedName("InstallmentEnableSSL")
    @ColumnInfo(name = "InstallmentEnableSSL")
    private String installmentEnableSSL;
    @SerializedName("InstallmentEnableSSLServerAuth")
    @ColumnInfo(name = "InstallmentEnableSSLServerAuth")
    private String installmentEnableSSLServerAuth;
    @SerializedName("InstallmentHeaderLength")
    @ColumnInfo(name = "InstallmentHeaderLength")
    private String installmentHeaderLength;
    @SerializedName("InstallmentHeaderTPDU")
    @ColumnInfo(name = "InstallmentHeaderTPDU")
    private String installmentHeaderTPDU;
    @SerializedName("InstallmentIpAdd")
    @ColumnInfo(name = "InstallmentIpAdd")
    private String installmentIpAdd;
    @SerializedName("InstallmentTcpPort")
    @ColumnInfo(name = "InstallmentTcpPort")
    private String installmentTcpPort;
    @SerializedName("LoyaltyConnTo")
    @ColumnInfo(name = "LoyaltyConnTo")
    private String loyaltyConnTo;
    @SerializedName("LoyaltyEnableSSL")
    @ColumnInfo(name = "LoyaltyEnableSSL")
    private String loyaltyEnableSSL;
    @SerializedName("LoyaltyEnableSSLServerAuth")
    @ColumnInfo(name = "LoyaltyEnableSSLServerAuth")
    private String loyaltyEnableSSLServerAuth;
    @SerializedName("LoyaltyHeaderLength")
    @ColumnInfo(name = "LoyaltyHeaderLength")
    private String loyaltyHeaderLength;
    @SerializedName("LoyaltyHeaderTPDU")
    @ColumnInfo(name = "LoyaltyHeaderTPDU")
    private String loyaltyHeaderTPDU;
    @SerializedName("LoyaltyIpAdd")
    @ColumnInfo(name = "LoyaltyIpAdd")
    private String loyaltyIpAdd;
    @SerializedName("LoyaltyNii")
    @ColumnInfo(name = "LoyaltyNii")
    private String loyaltyNii;
    @SerializedName("LoyaltyRecvTo")
    @ColumnInfo(name = "LoyaltyRecvTo")
    private String loyaltyRecvTo;
    @SerializedName("LoyaltySendTo")
    @ColumnInfo(name = "LoyaltySendTo")
    private String loyaltySendTo;
    @SerializedName("LoyaltyTcpPort")
    @ColumnInfo(name = "LoyaltyTcpPort")
    private String loyaltyTcpPort;
    @SerializedName("record_id")
    @ColumnInfo(name = "record_id")
    @PrimaryKey
    @NonNull
    private String recordId;
    @SerializedName("record_name")
    @ColumnInfo(name = "record_name")
    private String recordName;
    @SerializedName("RpmConnTo")
    @ColumnInfo(name = "RpmConnTo")
    private String rpmConnTo;
    @SerializedName("RpmEnableSSL")
    @ColumnInfo(name = "RpmEnableSSL")
    private String rpmEnableSSL;
    @SerializedName("RpmEnableSSLServerAuth")
    @ColumnInfo(name = "RpmEnableSSLServerAuth")
    private String rpmEnableSSLServerAuth;
    @SerializedName("RpmHeaderLength")
    @ColumnInfo(name = "RpmHeaderLength")
    private String rpmHeaderLength;
    @SerializedName("RpmHeaderTPDU")
    @ColumnInfo(name = "RpmHeaderTPDU")
    private String rpmHeaderTPDU;
    @SerializedName("RpmIpAdd")
    @ColumnInfo(name = "RpmIpAdd")
    private String rpmIpAdd;
    @SerializedName("RpmNii")
    @ColumnInfo(name = "RpmNii")
    private String rpmNii;
    @SerializedName("RpmRecvTo")
    @ColumnInfo(name = "RpmRecvTo")
    private String rpmRecvTo;
    @SerializedName("RpmSendTo")
    @ColumnInfo(name = "RpmSendTo")
    private String rpmSendTo;
    @SerializedName("RpmTcpPort")
    @ColumnInfo(name = "RpmTcpPort")
    private String rpmTcpPort;
    @SerializedName("secDccConnTo")
    @ColumnInfo(name = "secDccConnTo")
    private String secDccConnTo;
    @SerializedName("secDccEnableSSL")
    @ColumnInfo(name = "secDccEnableSSL")
    private String secDccEnableSSL;
    @SerializedName("secDccEnableSSLServerAuth")
    @ColumnInfo(name = "secDccEnableSSLServerAuth")
    private String secDccEnableSSLServerAuth;
    @SerializedName("secDccHeaderLength")
    @ColumnInfo(name = "secDccHeaderLength")
    private String secDccHeaderLength;
    @SerializedName("secDccHeaderTPDU")
    @ColumnInfo(name = "secDccHeaderTPDU")
    private String secDccHeaderTPDU;
    @SerializedName("secDccIpAdd")
    @ColumnInfo(name = "secDccIpAdd")
    private String secDccIpAdd;
    @SerializedName("secDccNii")
    @ColumnInfo(name = "secDccNii")
    private String secDccNii;
    @SerializedName("secDccRecvTo")
    @ColumnInfo(name = "secDccRecvTo")
    private String secDccRecvTo;
    @SerializedName("secDccSendTo")
    @ColumnInfo(name = "secDccSendTo")
    private String secDccSendTo;
    @SerializedName("secDccTcpPort")
    @ColumnInfo(name = "secDccTcpPort")
    private String secDccTcpPort;
    @SerializedName("secHostConnTo")
    @ColumnInfo(name = "secHostConnTo")
    private String secHostConnTo;
    @SerializedName("secHostEnableSSL")
    @ColumnInfo(name = "secHostEnableSSL")
    private String secHostEnableSSL;
    @SerializedName("secHostEnableSSLServerAuth")
    @ColumnInfo(name = "secHostEnableSSLServerAuth")
    private String secHostEnableSSLServerAuth;
    @SerializedName("secHostHeaderLength")
    @ColumnInfo(name = "secHostHeaderLength")
    private String secHostHeaderLength;
    @SerializedName("secHostHeaderTPDU")
    @ColumnInfo(name = "secHostHeaderTPDU")
    private String secHostHeaderTPDU;
    @SerializedName("secHostIpAdd")
    @ColumnInfo(name = "secHostIpAdd")
    private String secHostIpAdd;
    @SerializedName("secHostNii")
    @ColumnInfo(name = "secHostNii")
    private String secHostNii;
    @SerializedName("secHostRecvTo")
    @ColumnInfo(name = "secHostRecvTo")
    private String secHostRecvTo;
    @SerializedName("secHostSendTo")
    @ColumnInfo(name = "secHostSendTo")
    private String secHostSendTo;
    @SerializedName("secHostTcpPort")
    @ColumnInfo(name = "secHostTcpPort")
    private String secHostTcpPort;
    @SerializedName("secInstallmentConnTo")
    @ColumnInfo(name = "secInstallmentConnTo")
    private String secInstallmentConnTo;
    @SerializedName("secInstallmentEnableSSL")
    @ColumnInfo(name = "secInstallmentEnableSSL")
    private String secInstallmentEnableSSL;
    @SerializedName("secInstallmentEnableSSLServerAuth")
    @ColumnInfo(name = "secInstallmentEnableSSLServerAuth")
    private String secInstallmentEnableSSLServerAuth;
    @SerializedName("secInstallmentHeaderLength")
    @ColumnInfo(name = "secInstallmentHeaderLength")
    private String secInstallmentHeaderLength;
    @SerializedName("secInstallmentHeaderTPDU")
    @ColumnInfo(name = "secInstallmentHeaderTPDU")
    private String secInstallmentHeaderTPDU;
    @SerializedName("secInstallmentIpAdd")
    @ColumnInfo(name = "secInstallmentIpAdd")
    private String secInstallmentIpAdd;
    @SerializedName("secInstallmentNii")
    @ColumnInfo(name = "secInstallmentNii")
    private String secInstallmentNii;
    @SerializedName("secInstallmentRecvTo")
    @ColumnInfo(name = "secInstallmentRecvTo")
    private String secInstallmentRecvTo;
    @SerializedName("secInstallmentSendTo")
    @ColumnInfo(name = "secInstallmentSendTo")
    private String secInstallmentSendTo;
    @SerializedName("secInstallmentTcpPort")
    @ColumnInfo(name = "secInstallmentTcpPort")
    private String secInstallmentTcpPort;
    @SerializedName("secLoyaltyConnTo")
    @ColumnInfo(name = "secLoyaltyConnTo")
    private String secLoyaltyConnTo;
    @SerializedName("secLoyaltyEnableSSL")
    @ColumnInfo(name = "secLoyaltyEnableSSL")
    private String secLoyaltyEnableSSL;
    @SerializedName("secLoyaltyEnableSSLServerAuth")
    @ColumnInfo(name = "secLoyaltyEnableSSLServerAuth")
    private String secLoyaltyEnableSSLServerAuth;
    @SerializedName("secLoyaltyHeaderLength")
    @ColumnInfo(name = "secLoyaltyHeaderLength")
    private String secLoyaltyHeaderLength;
    @SerializedName("secLoyaltyHeaderTPDU")
    @ColumnInfo(name = "secLoyaltyHeaderTPDU")
    private String secLoyaltyHeaderTPDU;
    @SerializedName("secLoyaltyIpAdd")
    @ColumnInfo(name = "secLoyaltyIpAdd")
    private String secLoyaltyIpAdd;
    @SerializedName("secLoyaltyNii")
    @ColumnInfo(name = "secLoyaltyNii")
    private String secLoyaltyNii;
    @SerializedName("secLoyaltyRecvTo")
    @ColumnInfo(name = "secLoyaltyRecvTo")
    private String secLoyaltyRecvTo;
    @SerializedName("secLoyaltySendTo")
    @ColumnInfo(name = "secLoyaltySendTo")
    private String secLoyaltySendTo;
    @SerializedName("secLoyaltyTcpPort")
    @ColumnInfo(name = "secLoyaltyTcpPort")
    private String secLoyaltyTcpPort;
    @SerializedName("secRpmConnTo")
    @ColumnInfo(name = "secRpmConnTo")
    private String secRpmConnTo;
    @SerializedName("secRpmEnableSSL")
    @ColumnInfo(name = "secRpmEnableSSL")
    private String secRpmEnableSSL;
    @SerializedName("secRpmEnableSSLServerAuth")
    @ColumnInfo(name = "secRpmEnableSSLServerAuth")
    private String secRpmEnableSSLServerAuth;
    @SerializedName("secRpmHeaderLength")
    @ColumnInfo(name = "secRpmHeaderLength")
    private String secRpmHeaderLength;
    @SerializedName("secRpmHeaderTPDU")
    @ColumnInfo(name = "secRpmHeaderTPDU")
    private String secRpmHeaderTPDU;
    @SerializedName("secRpmIpAdd")
    @ColumnInfo(name = "secRpmIpAdd")
    private String secRpmIpAdd;
    @SerializedName("secRpmNii")
    @ColumnInfo(name = "secRpmNii")
    private String secRpmNii;
    @SerializedName("secRpmRecvTo")
    @ColumnInfo(name = "secRpmRecvTo")
    private String secRpmRecvTo;
    @SerializedName("secRpmSendTo")
    @ColumnInfo(name = "secRpmSendTo")
    private String secRpmSendTo;
    @SerializedName("secRpmTcpPort")
    @ColumnInfo(name = "secRpmTcpPort")
    private String secRpmTcpPort;
    @SerializedName("txtId")
    @ColumnInfo(name = "txtId")
    private String txtId;
    @SerializedName("txtName")
    @ColumnInfo(name = "txtName")
    @TLVOptions(paddingLength = 20)
    private String txtName;
    @SerializedName("txtHostProtocol")
    @ColumnInfo(name = "txtHostProtocol")
    @TLVOptions(paddingLength = 20)
    private String txtHostProtocol;
    @TLVOptions(paddingLength = 50)
    @SerializedName("xpiPassword")
    @ColumnInfo(name = "xpiPassword")
    private String xpiPassword;
    @TLVOptions(paddingLength = 50)
    @SerializedName("xpiSecretKey")
    @ColumnInfo(name = "xpiSecretKey")
    private String xpiSecretKey;
    @TLVOptions(paddingLength = 80)
    @SerializedName("xpiUrl")
    @ColumnInfo(name = "xpiUrl")
    private String xpiUrl;
    @TLVOptions(paddingLength = 50)
    @SerializedName("xpiUsername")
    @ColumnInfo(name = "xpiUsername")
    private String xpiUsername;

    @ColumnInfo(name = "commConfigTag")
    private String commConfigTag;

    @ColumnInfo(name = "acquirer_id")
    private String acquirerId;

    public String getTxtHostProtocol() {
        return txtHostProtocol;
    }

    public void setTxtHostProtocol(String txtHostProtocol) {
        this.txtHostProtocol = txtHostProtocol;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
    public String getXpiPassword() {
        return xpiPassword;
    }

    public void setXpiPassword(String xpiPassword) {
        this.xpiPassword = xpiPassword;
    }

    public String getXpiSecretKey() {
        return xpiSecretKey;
    }

    public void setXpiSecretKey(String xpiSecretKey) {
        this.xpiSecretKey = xpiSecretKey;
    }

    public String getXpiUrl() {
        return xpiUrl;
    }

    public void setXpiUrl(String xpiUrl) {
        this.xpiUrl = xpiUrl;
    }

    public String getXpiUsername() {
        return xpiUsername;
    }

    public void setXpiUsername(String xpiUsername) {
        this.xpiUsername = xpiUsername;
    }

    public String getCommConfigTag() {
        return commConfigTag;
    }

    public void setCommConfigTag(String commConfigTag) {
        this.commConfigTag = commConfigTag;
    }

    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    public String getAcquirerId() {
        return acquirerId;
    }

    public String getInstallmentNii() {
        return installmentNii;
    }

    public void setInstallmentNii(String installmentNii) {
        this.installmentNii = installmentNii;
    }

    public String getInstallmentRecvTo() {
        return installmentRecvTo;
    }

    public void setInstallmentRecvTo(String installmentRecvTo) {
        this.installmentRecvTo = installmentRecvTo;
    }

    public String getInstallmentSendTo() {
        return installmentSendTo;
    }

    public void setInstallmentSendTo(String installmentSendTo) {
        this.installmentSendTo = installmentSendTo;
    }

    public String getCliqUrl() {
        return cliqUrl;
    }

    public void setCliqUrl(String cliqUrl) {
        this.cliqUrl = cliqUrl;
    }

    public String getDccConnTo() {
        return dccConnTo;
    }

    public void setDccConnTo(String dccConnTo) {
        this.dccConnTo = dccConnTo;
    }

    public String getDccEnableSSL() {
        return dccEnableSSL;
    }

    public void setDccEnableSSL(String dccEnableSSL) {
        this.dccEnableSSL = dccEnableSSL;
    }

    public String getDccEnableSSLServerAuth() {
        return dccEnableSSLServerAuth;
    }

    public void setDccEnableSSLServerAuth(String dccEnableSSLServerAuth) {
        this.dccEnableSSLServerAuth = dccEnableSSLServerAuth;
    }

    public String getDccHeaderLength() {
        return dccHeaderLength;
    }

    public void setDccHeaderLength(String dccHeaderLength) {
        this.dccHeaderLength = dccHeaderLength;
    }

    public String getDccHeaderTPDU() {
        return dccHeaderTPDU;
    }

    public void setDccHeaderTPDU(String dccHeaderTPDU) {
        this.dccHeaderTPDU = dccHeaderTPDU;
    }

    public String getDccIpAdd() {
        return dccIpAdd;
    }

    public void setDccIpAdd(String dccIpAdd) {
        this.dccIpAdd = dccIpAdd;
    }

    public String getDccNii() {
        return dccNii;
    }

    public void setDccNii(String dccNii) {
        this.dccNii = dccNii;
    }

    public String getDccRecvTo() {
        return dccRecvTo;
    }

    public void setDccRecvTo(String dccRecvTo) {
        this.dccRecvTo = dccRecvTo;
    }

    public String getDccSendTo() {
        return dccSendTo;
    }

    public void setDccSendTo(String dccSendTo) {
        this.dccSendTo = dccSendTo;
    }

    public String getDccTcpPort() {
        return dccTcpPort;
    }

    public void setDccTcpPort(String dccTcpPort) {
        this.dccTcpPort = dccTcpPort;
    }

    public String getHostConnTo() {
        return hostConnTo;
    }

    public void setHostConnTo(String hostConnTo) {
        this.hostConnTo = hostConnTo;
    }

    public String getHostEnableSSL() {
        return hostEnableSSL;
    }

    public void setHostEnableSSL(String hostEnableSSL) {
        this.hostEnableSSL = hostEnableSSL;
    }

    public String getHostEnableSSLServerAuth() {
        return hostEnableSSLServerAuth;
    }

    public void setHostEnableSSLServerAuth(String hostEnableSSLServerAuth) {
        this.hostEnableSSLServerAuth = hostEnableSSLServerAuth;
    }

    public String getHostHeaderLength() {
        return hostHeaderLength;
    }

    public void setHostHeaderLength(String hostHeaderLength) {
        this.hostHeaderLength = hostHeaderLength;
    }

    public String getHostHeaderTPDU() {
        return hostHeaderTPDU;
    }

    public void setHostHeaderTPDU(String hostHeaderTPDU) {
        this.hostHeaderTPDU = hostHeaderTPDU;
    }

    public String getHostIpAdd() {
        return hostIpAdd;
    }

    public void setHostIpAdd(String hostIpAdd) {
        this.hostIpAdd = hostIpAdd;
    }

    public String getHostNii() {
        return hostNii;
    }

    public void setHostNii(String hostNii) {
        this.hostNii = hostNii;
    }

    public String getHostRecvTo() {
        return hostRecvTo;
    }

    public void setHostRecvTo(String hostRecvTo) {
        this.hostRecvTo = hostRecvTo;
    }

    public String getHostSendTo() {
        return hostSendTo;
    }

    public void setHostSendTo(String hostSendTo) {
        this.hostSendTo = hostSendTo;
    }

    public String getHostTcpPort() {
        return hostTcpPort;
    }

    public void setHostTcpPort(String hostTcpPort) {
        this.hostTcpPort = hostTcpPort;
    }

    public String getInstallmentConnTo() {
        return installmentConnTo;
    }

    public void setInstallmentConnTo(String installmentConnTo) {
        this.installmentConnTo = installmentConnTo;
    }

    public String getInstallmentEnableSSL() {
        return installmentEnableSSL;
    }

    public void setInstallmentEnableSSL(String installmentEnableSSL) {
        this.installmentEnableSSL = installmentEnableSSL;
    }

    public String getInstallmentEnableSSLServerAuth() {
        return installmentEnableSSLServerAuth;
    }

    public void setInstallmentEnableSSLServerAuth(String installmentEnableSSLServerAuth) {
        this.installmentEnableSSLServerAuth = installmentEnableSSLServerAuth;
    }

    public String getInstallmentHeaderLength() {
        return installmentHeaderLength;
    }

    public void setInstallmentHeaderLength(String installmentHeaderLength) {
        this.installmentHeaderLength = installmentHeaderLength;
    }

    public String getInstallmentHeaderTPDU() {
        return installmentHeaderTPDU;
    }

    public void setInstallmentHeaderTPDU(String installmentHeaderTPDU) {
        this.installmentHeaderTPDU = installmentHeaderTPDU;
    }

    public String getInstallmentIpAdd() {
        return installmentIpAdd;
    }

    public void setInstallmentIpAdd(String installmentIpAdd) {
        this.installmentIpAdd = installmentIpAdd;
    }

    public String getInstallmentTcpPort() {
        return installmentTcpPort;
    }

    public void setInstallmentTcpPort(String installmentTcpPort) {
        this.installmentTcpPort = installmentTcpPort;
    }

    public String getLoyaltyConnTo() {
        return loyaltyConnTo;
    }

    public void setLoyaltyConnTo(String loyaltyConnTo) {
        this.loyaltyConnTo = loyaltyConnTo;
    }

    public String getLoyaltyEnableSSL() {
        return loyaltyEnableSSL;
    }

    public void setLoyaltyEnableSSL(String loyaltyEnableSSL) {
        this.loyaltyEnableSSL = loyaltyEnableSSL;
    }

    public String getLoyaltyEnableSSLServerAuth() {
        return loyaltyEnableSSLServerAuth;
    }

    public void setLoyaltyEnableSSLServerAuth(String loyaltyEnableSSLServerAuth) {
        this.loyaltyEnableSSLServerAuth = loyaltyEnableSSLServerAuth;
    }

    public String getLoyaltyHeaderLength() {
        return loyaltyHeaderLength;
    }

    public void setLoyaltyHeaderLength(String loyaltyHeaderLength) {
        this.loyaltyHeaderLength = loyaltyHeaderLength;
    }

    public String getLoyaltyHeaderTPDU() {
        return loyaltyHeaderTPDU;
    }

    public void setLoyaltyHeaderTPDU(String loyaltyHeaderTPDU) {
        this.loyaltyHeaderTPDU = loyaltyHeaderTPDU;
    }

    public String getLoyaltyIpAdd() {
        return loyaltyIpAdd;
    }

    public void setLoyaltyIpAdd(String loyaltyIpAdd) {
        this.loyaltyIpAdd = loyaltyIpAdd;
    }

    public String getLoyaltyNii() {
        return loyaltyNii;
    }

    public void setLoyaltyNii(String loyaltyNii) {
        this.loyaltyNii = loyaltyNii;
    }

    public String getLoyaltyRecvTo() {
        return loyaltyRecvTo;
    }

    public void setLoyaltyRecvTo(String loyaltyRecvTo) {
        this.loyaltyRecvTo = loyaltyRecvTo;
    }

    public String getLoyaltySendTo() {
        return loyaltySendTo;
    }

    public void setLoyaltySendTo(String loyaltySendTo) {
        this.loyaltySendTo = loyaltySendTo;
    }

    public String getLoyaltyTcpPort() {
        return loyaltyTcpPort;
    }

    public void setLoyaltyTcpPort(String loyaltyTcpPort) {
        this.loyaltyTcpPort = loyaltyTcpPort;
    }

    public String getRecordId() {
        return recordId;
    }

    @Override
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getRecordName() {
        return recordName;
    }

    @Override
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getRpmConnTo() {
        return rpmConnTo;
    }

    public void setRpmConnTo(String rpmConnTo) {
        this.rpmConnTo = rpmConnTo;
    }

    public String getRpmEnableSSL() {
        return rpmEnableSSL;
    }

    public void setRpmEnableSSL(String rpmEnableSSL) {
        this.rpmEnableSSL = rpmEnableSSL;
    }

    public String getRpmEnableSSLServerAuth() {
        return rpmEnableSSLServerAuth;
    }

    public void setRpmEnableSSLServerAuth(String rpmEnableSSLServerAuth) {
        this.rpmEnableSSLServerAuth = rpmEnableSSLServerAuth;
    }

    public String getRpmHeaderLength() {
        return rpmHeaderLength;
    }

    public void setRpmHeaderLength(String rpmHeaderLength) {
        this.rpmHeaderLength = rpmHeaderLength;
    }

    public String getRpmHeaderTPDU() {
        return rpmHeaderTPDU;
    }

    public void setRpmHeaderTPDU(String rpmHeaderTPDU) {
        this.rpmHeaderTPDU = rpmHeaderTPDU;
    }

    public String getRpmIpAdd() {
        return rpmIpAdd;
    }

    public void setRpmIpAdd(String rpmIpAdd) {
        this.rpmIpAdd = rpmIpAdd;
    }

    public String getRpmNii() {
        return rpmNii;
    }

    public void setRpmNii(String rpmNii) {
        this.rpmNii = rpmNii;
    }

    public String getRpmRecvTo() {
        return rpmRecvTo;
    }

    public void setRpmRecvTo(String rpmRecvTo) {
        this.rpmRecvTo = rpmRecvTo;
    }

    public String getRpmSendTo() {
        return rpmSendTo;
    }

    public void setRpmSendTo(String rpmSendTo) {
        this.rpmSendTo = rpmSendTo;
    }

    public String getRpmTcpPort() {
        return rpmTcpPort;
    }

    public void setRpmTcpPort(String rpmTcpPort) {
        this.rpmTcpPort = rpmTcpPort;
    }

    public String getSecDccConnTo() {
        return secDccConnTo;
    }

    public void setSecDccConnTo(String secDccConnTo) {
        this.secDccConnTo = secDccConnTo;
    }

    public String getSecDccEnableSSL() {
        return secDccEnableSSL;
    }

    public void setSecDccEnableSSL(String secDccEnableSSL) {
        this.secDccEnableSSL = secDccEnableSSL;
    }

    public String getSecDccEnableSSLServerAuth() {
        return secDccEnableSSLServerAuth;
    }

    public void setSecDccEnableSSLServerAuth(String secDccEnableSSLServerAuth) {
        this.secDccEnableSSLServerAuth = secDccEnableSSLServerAuth;
    }

    public String getSecDccHeaderLength() {
        return secDccHeaderLength;
    }

    public void setSecDccHeaderLength(String secDccHeaderLength) {
        this.secDccHeaderLength = secDccHeaderLength;
    }

    public String getSecDccHeaderTPDU() {
        return secDccHeaderTPDU;
    }

    public void setSecDccHeaderTPDU(String secDccHeaderTPDU) {
        this.secDccHeaderTPDU = secDccHeaderTPDU;
    }

    public String getSecDccIpAdd() {
        return secDccIpAdd;
    }

    public void setSecDccIpAdd(String secDccIpAdd) {
        this.secDccIpAdd = secDccIpAdd;
    }

    public String getSecDccNii() {
        return secDccNii;
    }

    public void setSecDccNii(String secDccNii) {
        this.secDccNii = secDccNii;
    }

    public String getSecDccRecvTo() {
        return secDccRecvTo;
    }

    public void setSecDccRecvTo(String secDccRecvTo) {
        this.secDccRecvTo = secDccRecvTo;
    }

    public String getSecDccSendTo() {
        return secDccSendTo;
    }

    public void setSecDccSendTo(String secDccSendTo) {
        this.secDccSendTo = secDccSendTo;
    }

    public String getSecDccTcpPort() {
        return secDccTcpPort;
    }

    public void setSecDccTcpPort(String secDccTcpPort) {
        this.secDccTcpPort = secDccTcpPort;
    }

    public String getSecHostConnTo() {
        return secHostConnTo;
    }

    public void setSecHostConnTo(String secHostConnTo) {
        this.secHostConnTo = secHostConnTo;
    }

    public String getSecHostEnableSSL() {
        return secHostEnableSSL;
    }

    public void setSecHostEnableSSL(String secHostEnableSSL) {
        this.secHostEnableSSL = secHostEnableSSL;
    }

    public String getSecHostEnableSSLServerAuth() {
        return secHostEnableSSLServerAuth;
    }

    public void setSecHostEnableSSLServerAuth(String secHostEnableSSLServerAuth) {
        this.secHostEnableSSLServerAuth = secHostEnableSSLServerAuth;
    }

    public String getSecHostHeaderLength() {
        return secHostHeaderLength;
    }

    public void setSecHostHeaderLength(String secHostHeaderLength) {
        this.secHostHeaderLength = secHostHeaderLength;
    }

    public String getSecHostHeaderTPDU() {
        return secHostHeaderTPDU;
    }

    public void setSecHostHeaderTPDU(String secHostHeaderTPDU) {
        this.secHostHeaderTPDU = secHostHeaderTPDU;
    }

    public String getSecHostIpAdd() {
        return secHostIpAdd;
    }

    public void setSecHostIpAdd(String secHostIpAdd) {
        this.secHostIpAdd = secHostIpAdd;
    }

    public String getSecHostNii() {
        return secHostNii;
    }

    public void setSecHostNii(String secHostNii) {
        this.secHostNii = secHostNii;
    }

    public String getSecHostRecvTo() {
        return secHostRecvTo;
    }

    public void setSecHostRecvTo(String secHostRecvTo) {
        this.secHostRecvTo = secHostRecvTo;
    }

    public String getSecHostSendTo() {
        return secHostSendTo;
    }

    public void setSecHostSendTo(String secHostSendTo) {
        this.secHostSendTo = secHostSendTo;
    }

    public String getSecHostTcpPort() {
        return secHostTcpPort;
    }

    public void setSecHostTcpPort(String secHostTcpPort) {
        this.secHostTcpPort = secHostTcpPort;
    }

    public String getSecInstallmentConnTo() {
        return secInstallmentConnTo;
    }

    public void setSecInstallmentConnTo(String secInstallmentConnTo) {
        this.secInstallmentConnTo = secInstallmentConnTo;
    }

    public String getSecInstallmentEnableSSL() {
        return secInstallmentEnableSSL;
    }

    public void setSecInstallmentEnableSSL(String secInstallmentEnableSSL) {
        this.secInstallmentEnableSSL = secInstallmentEnableSSL;
    }

    public String getSecInstallmentEnableSSLServerAuth() {
        return secInstallmentEnableSSLServerAuth;
    }

    public void setSecInstallmentEnableSSLServerAuth(String secInstallmentEnableSSLServerAuth) {
        this.secInstallmentEnableSSLServerAuth = secInstallmentEnableSSLServerAuth;
    }

    public String getSecInstallmentHeaderLength() {
        return secInstallmentHeaderLength;
    }

    public void setSecInstallmentHeaderLength(String secInstallmentHeaderLength) {
        this.secInstallmentHeaderLength = secInstallmentHeaderLength;
    }

    public String getSecInstallmentHeaderTPDU() {
        return secInstallmentHeaderTPDU;
    }

    public void setSecInstallmentHeaderTPDU(String secInstallmentHeaderTPDU) {
        this.secInstallmentHeaderTPDU = secInstallmentHeaderTPDU;
    }

    public String getSecInstallmentIpAdd() {
        return secInstallmentIpAdd;
    }

    public void setSecInstallmentIpAdd(String secInstallmentIpAdd) {
        this.secInstallmentIpAdd = secInstallmentIpAdd;
    }

    public String getSecInstallmentNii() {
        return secInstallmentNii;
    }

    public void setSecInstallmentNii(String secInstallmentNii) {
        this.secInstallmentNii = secInstallmentNii;
    }

    public String getSecInstallmentRecvTo() {
        return secInstallmentRecvTo;
    }

    public void setSecInstallmentRecvTo(String secInstallmentRecvTo) {
        this.secInstallmentRecvTo = secInstallmentRecvTo;
    }

    public String getSecInstallmentSendTo() {
        return secInstallmentSendTo;
    }

    public void setSecInstallmentSendTo(String secInstallmentSendTo) {
        this.secInstallmentSendTo = secInstallmentSendTo;
    }

    public String getSecInstallmentTcpPort() {
        return secInstallmentTcpPort;
    }

    public void setSecInstallmentTcpPort(String secInstallmentTcpPort) {
        this.secInstallmentTcpPort = secInstallmentTcpPort;
    }

    public String getSecLoyaltyConnTo() {
        return secLoyaltyConnTo;
    }

    public void setSecLoyaltyConnTo(String secLoyaltyConnTo) {
        this.secLoyaltyConnTo = secLoyaltyConnTo;
    }

    public String getSecLoyaltyEnableSSL() {
        return secLoyaltyEnableSSL;
    }

    public void setSecLoyaltyEnableSSL(String secLoyaltyEnableSSL) {
        this.secLoyaltyEnableSSL = secLoyaltyEnableSSL;
    }

    public String getSecLoyaltyEnableSSLServerAuth() {
        return secLoyaltyEnableSSLServerAuth;
    }

    public void setSecLoyaltyEnableSSLServerAuth(String secLoyaltyEnableSSLServerAuth) {
        this.secLoyaltyEnableSSLServerAuth = secLoyaltyEnableSSLServerAuth;
    }

    public String getSecLoyaltyHeaderLength() {
        return secLoyaltyHeaderLength;
    }

    public void setSecLoyaltyHeaderLength(String secLoyaltyHeaderLength) {
        this.secLoyaltyHeaderLength = secLoyaltyHeaderLength;
    }

    public String getSecLoyaltyHeaderTPDU() {
        return secLoyaltyHeaderTPDU;
    }

    public void setSecLoyaltyHeaderTPDU(String secLoyaltyHeaderTPDU) {
        this.secLoyaltyHeaderTPDU = secLoyaltyHeaderTPDU;
    }

    public String getSecLoyaltyIpAdd() {
        return secLoyaltyIpAdd;
    }

    public void setSecLoyaltyIpAdd(String secLoyaltyIpAdd) {
        this.secLoyaltyIpAdd = secLoyaltyIpAdd;
    }

    public String getSecLoyaltyNii() {
        return secLoyaltyNii;
    }

    public void setSecLoyaltyNii(String secLoyaltyNii) {
        this.secLoyaltyNii = secLoyaltyNii;
    }

    public String getSecLoyaltyRecvTo() {
        return secLoyaltyRecvTo;
    }

    public void setSecLoyaltyRecvTo(String secLoyaltyRecvTo) {
        this.secLoyaltyRecvTo = secLoyaltyRecvTo;
    }

    public String getSecLoyaltySendTo() {
        return secLoyaltySendTo;
    }

    public void setSecLoyaltySendTo(String secLoyaltySendTo) {
        this.secLoyaltySendTo = secLoyaltySendTo;
    }

    public String getSecLoyaltyTcpPort() {
        return secLoyaltyTcpPort;
    }

    public void setSecLoyaltyTcpPort(String secLoyaltyTcpPort) {
        this.secLoyaltyTcpPort = secLoyaltyTcpPort;
    }

    public String getSecRpmConnTo() {
        return secRpmConnTo;
    }

    public void setSecRpmConnTo(String secRpmConnTo) {
        this.secRpmConnTo = secRpmConnTo;
    }

    public String getSecRpmEnableSSL() {
        return secRpmEnableSSL;
    }

    public void setSecRpmEnableSSL(String secRpmEnableSSL) {
        this.secRpmEnableSSL = secRpmEnableSSL;
    }

    public String getSecRpmEnableSSLServerAuth() {
        return secRpmEnableSSLServerAuth;
    }

    public void setSecRpmEnableSSLServerAuth(String secRpmEnableSSLServerAuth) {
        this.secRpmEnableSSLServerAuth = secRpmEnableSSLServerAuth;
    }

    public String getSecRpmHeaderLength() {
        return secRpmHeaderLength;
    }

    public void setSecRpmHeaderLength(String secRpmHeaderLength) {
        this.secRpmHeaderLength = secRpmHeaderLength;
    }

    public String getSecRpmHeaderTPDU() {
        return secRpmHeaderTPDU;
    }

    public void setSecRpmHeaderTPDU(String secRpmHeaderTPDU) {
        this.secRpmHeaderTPDU = secRpmHeaderTPDU;
    }

    public String getSecRpmIpAdd() {
        return secRpmIpAdd;
    }

    public void setSecRpmIpAdd(String secRpmIpAdd) {
        this.secRpmIpAdd = secRpmIpAdd;
    }

    public String getSecRpmNii() {
        return secRpmNii;
    }

    public void setSecRpmNii(String secRpmNii) {
        this.secRpmNii = secRpmNii;
    }

    public String getSecRpmRecvTo() {
        return secRpmRecvTo;
    }

    public void setSecRpmRecvTo(String secRpmRecvTo) {
        this.secRpmRecvTo = secRpmRecvTo;
    }

    public String getSecRpmSendTo() {
        return secRpmSendTo;
    }

    public void setSecRpmSendTo(String secRpmSendTo) {
        this.secRpmSendTo = secRpmSendTo;
    }

    public String getSecRpmTcpPort() {
        return secRpmTcpPort;
    }

    public void setSecRpmTcpPort(String secRpmTcpPort) {
        this.secRpmTcpPort = secRpmTcpPort;
    }

    public String getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    @Override
    public String tagPrefix() {
        return commConfigTag;
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
        commConfigTag = prefix;
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
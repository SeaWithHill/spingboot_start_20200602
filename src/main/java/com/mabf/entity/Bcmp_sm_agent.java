package com.mabf.entity;

import java.io.Serializable;

public class Bcmp_sm_agent implements Serializable {
    private String agentId;

    private String hostName;

    private String hostAddress;

    private String osName;

    private String rmiPort;

    private String socketPort;

    private String httpPort;

    private String registryTime;

    private String version;

    private String status;

    private String socketStatus;

    private String httpStatus;

    private String appWorkspace;

    private static final long serialVersionUID = 1L;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress == null ? null : hostAddress.trim();
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName == null ? null : osName.trim();
    }

    public String getRmiPort() {
        return rmiPort;
    }

    public void setRmiPort(String rmiPort) {
        this.rmiPort = rmiPort == null ? null : rmiPort.trim();
    }

    public String getSocketPort() {
        return socketPort;
    }

    public void setSocketPort(String socketPort) {
        this.socketPort = socketPort == null ? null : socketPort.trim();
    }

    public String getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(String httpPort) {
        this.httpPort = httpPort == null ? null : httpPort.trim();
    }

    public String getRegistryTime() {
        return registryTime;
    }

    public void setRegistryTime(String registryTime) {
        this.registryTime = registryTime == null ? null : registryTime.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSocketStatus() {
        return socketStatus;
    }

    public void setSocketStatus(String socketStatus) {
        this.socketStatus = socketStatus == null ? null : socketStatus.trim();
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus == null ? null : httpStatus.trim();
    }

    public String getAppWorkspace() {
        return appWorkspace;
    }

    public void setAppWorkspace(String appWorkspace) {
        this.appWorkspace = appWorkspace == null ? null : appWorkspace.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Bcmp_sm_agent other = (Bcmp_sm_agent) that;
        return (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getHostName() == null ? other.getHostName() == null : this.getHostName().equals(other.getHostName()))
            && (this.getHostAddress() == null ? other.getHostAddress() == null : this.getHostAddress().equals(other.getHostAddress()))
            && (this.getOsName() == null ? other.getOsName() == null : this.getOsName().equals(other.getOsName()))
            && (this.getRmiPort() == null ? other.getRmiPort() == null : this.getRmiPort().equals(other.getRmiPort()))
            && (this.getSocketPort() == null ? other.getSocketPort() == null : this.getSocketPort().equals(other.getSocketPort()))
            && (this.getHttpPort() == null ? other.getHttpPort() == null : this.getHttpPort().equals(other.getHttpPort()))
            && (this.getRegistryTime() == null ? other.getRegistryTime() == null : this.getRegistryTime().equals(other.getRegistryTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSocketStatus() == null ? other.getSocketStatus() == null : this.getSocketStatus().equals(other.getSocketStatus()))
            && (this.getHttpStatus() == null ? other.getHttpStatus() == null : this.getHttpStatus().equals(other.getHttpStatus()))
            && (this.getAppWorkspace() == null ? other.getAppWorkspace() == null : this.getAppWorkspace().equals(other.getAppWorkspace()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getHostName() == null) ? 0 : getHostName().hashCode());
        result = prime * result + ((getHostAddress() == null) ? 0 : getHostAddress().hashCode());
        result = prime * result + ((getOsName() == null) ? 0 : getOsName().hashCode());
        result = prime * result + ((getRmiPort() == null) ? 0 : getRmiPort().hashCode());
        result = prime * result + ((getSocketPort() == null) ? 0 : getSocketPort().hashCode());
        result = prime * result + ((getHttpPort() == null) ? 0 : getHttpPort().hashCode());
        result = prime * result + ((getRegistryTime() == null) ? 0 : getRegistryTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSocketStatus() == null) ? 0 : getSocketStatus().hashCode());
        result = prime * result + ((getHttpStatus() == null) ? 0 : getHttpStatus().hashCode());
        result = prime * result + ((getAppWorkspace() == null) ? 0 : getAppWorkspace().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agentId=").append(agentId);
        sb.append(", hostName=").append(hostName);
        sb.append(", hostAddress=").append(hostAddress);
        sb.append(", osName=").append(osName);
        sb.append(", rmiPort=").append(rmiPort);
        sb.append(", socketPort=").append(socketPort);
        sb.append(", httpPort=").append(httpPort);
        sb.append(", registryTime=").append(registryTime);
        sb.append(", version=").append(version);
        sb.append(", status=").append(status);
        sb.append(", socketStatus=").append(socketStatus);
        sb.append(", httpStatus=").append(httpStatus);
        sb.append(", appWorkspace=").append(appWorkspace);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
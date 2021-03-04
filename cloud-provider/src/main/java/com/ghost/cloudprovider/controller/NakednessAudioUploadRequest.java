
package com.ghost.cloudprovider.controller;
import java.io.Serializable;
import java.util.Objects;

public class NakednessAudioUploadRequest implements Serializable {

    private String seq;

    private String clientKey;

    private String digest;

    private String msisdn;

    private String nakednessAudioName;

    private String nickName;

    public NakednessAudioUploadRequest() {
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getNakednessAudioName() {
        return nakednessAudioName;
    }

    public void setNakednessAudioName(String nakednessAudioName) {
        this.nakednessAudioName = nakednessAudioName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NakednessAudioUploadRequest that = (NakednessAudioUploadRequest) o;
        return Objects.equals(seq, that.seq) &&
                Objects.equals(clientKey, that.clientKey) &&
                Objects.equals(digest, that.digest) &&
                Objects.equals(msisdn, that.msisdn) &&
                Objects.equals(nakednessAudioName, that.nakednessAudioName) &&
                Objects.equals(nickName, that.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seq, clientKey, digest, msisdn, nakednessAudioName, nickName);
    }

    @Override
    public String toString() {
        return "NakednessAudioUploadRequest{" +
                "seq='" + seq + '\'' +
                ", clientKey='" + clientKey + '\'' +
                ", digest='" + digest + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", nakednessAudioName='" + nakednessAudioName + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
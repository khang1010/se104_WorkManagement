package com.example.workmanagement.utils.dto;

import com.squareup.moshi.Json;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageDTO {

    @Json(name = "boardId")
    private long boardId;

    @Json(name = "boardName")
    private String boardName;

    @Json(name = "email")
    private String email;

    @Json(name = "displayName")
    private String displayName;

    @Json(name = "photoUrl")
    private String photoUrl;

    @Json(name = "message")
    private String message;

    @Json(name = "timestamp")
    private String timestamp;

    public MessageDTO(long boardId, String boardName, String email, String displayName, String photoUrl, String message) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.email = email;
        this.displayName = displayName;
        this.photoUrl = photoUrl;
        this.message = message;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
    }

    public long getBoardId() {
        return boardId;
    }

    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }
}

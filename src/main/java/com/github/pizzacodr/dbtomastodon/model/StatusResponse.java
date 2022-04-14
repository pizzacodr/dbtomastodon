package com.github.pizzacodr.dbtomastodon.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "created_at",
    "in_reply_to_id",
    "in_reply_to_account_id",
    "sensitive",
    "spoiler_text",
    "visibility",
    "language",
    "uri",
    "url",
    "replies_count",
    "reblogs_count",
    "favourites_count",
    "edited_at",
    "favourited",
    "reblogged",
    "muted",
    "bookmarked",
    "pinned",
    "content",
    "reblog",
    "application",
    "account",
    "media_attachments",
    "mentions",
    "tags",
    "emojis",
    "card",
    "poll"
})
@Generated("jsonschema2pojo")
public class StatusResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("in_reply_to_id")
    private Object inReplyToId;
    @JsonProperty("in_reply_to_account_id")
    private Object inReplyToAccountId;
    @JsonProperty("sensitive")
    private Boolean sensitive;
    @JsonProperty("spoiler_text")
    private String spoilerText;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("language")
    private String language;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("url")
    private String url;
    @JsonProperty("replies_count")
    private Integer repliesCount;
    @JsonProperty("reblogs_count")
    private Integer reblogsCount;
    @JsonProperty("favourites_count")
    private Integer favouritesCount;
    @JsonProperty("edited_at")
    private Object editedAt;
    @JsonProperty("favourited")
    private Boolean favourited;
    @JsonProperty("reblogged")
    private Boolean reblogged;
    @JsonProperty("muted")
    private Boolean muted;
    @JsonProperty("bookmarked")
    private Boolean bookmarked;
    @JsonProperty("pinned")
    private Boolean pinned;
    @JsonProperty("content")
    private String content;
    @JsonProperty("reblog")
    private Object reblog;
    @JsonProperty("application")
    private Application application;
    @JsonProperty("account")
    private Account account;
    @JsonProperty("media_attachments")
    private List<Object> mediaAttachments = null;
    @JsonProperty("mentions")
    private List<Object> mentions = null;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("emojis")
    private List<Object> emojis = null;
    @JsonProperty("card")
    private Object card;
    @JsonProperty("poll")
    private Object poll;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("in_reply_to_id")
    public Object getInReplyToId() {
        return inReplyToId;
    }

    @JsonProperty("in_reply_to_id")
    public void setInReplyToId(Object inReplyToId) {
        this.inReplyToId = inReplyToId;
    }

    @JsonProperty("in_reply_to_account_id")
    public Object getInReplyToAccountId() {
        return inReplyToAccountId;
    }

    @JsonProperty("in_reply_to_account_id")
    public void setInReplyToAccountId(Object inReplyToAccountId) {
        this.inReplyToAccountId = inReplyToAccountId;
    }

    @JsonProperty("sensitive")
    public Boolean getSensitive() {
        return sensitive;
    }

    @JsonProperty("sensitive")
    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    @JsonProperty("spoiler_text")
    public String getSpoilerText() {
        return spoilerText;
    }

    @JsonProperty("spoiler_text")
    public void setSpoilerText(String spoilerText) {
        this.spoilerText = spoilerText;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("replies_count")
    public Integer getRepliesCount() {
        return repliesCount;
    }

    @JsonProperty("replies_count")
    public void setRepliesCount(Integer repliesCount) {
        this.repliesCount = repliesCount;
    }

    @JsonProperty("reblogs_count")
    public Integer getReblogsCount() {
        return reblogsCount;
    }

    @JsonProperty("reblogs_count")
    public void setReblogsCount(Integer reblogsCount) {
        this.reblogsCount = reblogsCount;
    }

    @JsonProperty("favourites_count")
    public Integer getFavouritesCount() {
        return favouritesCount;
    }

    @JsonProperty("favourites_count")
    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    @JsonProperty("edited_at")
    public Object getEditedAt() {
        return editedAt;
    }

    @JsonProperty("edited_at")
    public void setEditedAt(Object editedAt) {
        this.editedAt = editedAt;
    }

    @JsonProperty("favourited")
    public Boolean getFavourited() {
        return favourited;
    }

    @JsonProperty("favourited")
    public void setFavourited(Boolean favourited) {
        this.favourited = favourited;
    }

    @JsonProperty("reblogged")
    public Boolean getReblogged() {
        return reblogged;
    }

    @JsonProperty("reblogged")
    public void setReblogged(Boolean reblogged) {
        this.reblogged = reblogged;
    }

    @JsonProperty("muted")
    public Boolean getMuted() {
        return muted;
    }

    @JsonProperty("muted")
    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    @JsonProperty("bookmarked")
    public Boolean getBookmarked() {
        return bookmarked;
    }

    @JsonProperty("bookmarked")
    public void setBookmarked(Boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    @JsonProperty("pinned")
    public Boolean getPinned() {
        return pinned;
    }

    @JsonProperty("pinned")
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("reblog")
    public Object getReblog() {
        return reblog;
    }

    @JsonProperty("reblog")
    public void setReblog(Object reblog) {
        this.reblog = reblog;
    }

    @JsonProperty("application")
    public Application getApplication() {
        return application;
    }

    @JsonProperty("application")
    public void setApplication(Application application) {
        this.application = application;
    }

    @JsonProperty("account")
    public Account getAccount() {
        return account;
    }

    @JsonProperty("account")
    public void setAccount(Account account) {
        this.account = account;
    }

    @JsonProperty("media_attachments")
    public List<Object> getMediaAttachments() {
        return mediaAttachments;
    }

    @JsonProperty("media_attachments")
    public void setMediaAttachments(List<Object> mediaAttachments) {
        this.mediaAttachments = mediaAttachments;
    }

    @JsonProperty("mentions")
    public List<Object> getMentions() {
        return mentions;
    }

    @JsonProperty("mentions")
    public void setMentions(List<Object> mentions) {
        this.mentions = mentions;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("emojis")
    public List<Object> getEmojis() {
        return emojis;
    }

    @JsonProperty("emojis")
    public void setEmojis(List<Object> emojis) {
        this.emojis = emojis;
    }

    @JsonProperty("card")
    public Object getCard() {
        return card;
    }

    @JsonProperty("card")
    public void setCard(Object card) {
        this.card = card;
    }

    @JsonProperty("poll")
    public Object getPoll() {
        return poll;
    }

    @JsonProperty("poll")
    public void setPoll(Object poll) {
        this.poll = poll;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

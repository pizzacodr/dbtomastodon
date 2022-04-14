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
@JsonPropertyOrder({ "id", "username", "acct", "display_name", "locked", "bot", "discoverable", "group", "created_at",
		"note", "url", "avatar", "avatar_static", "header", "header_static", "followers_count", "following_count",
		"statuses_count", "last_status_at", "emojis", "fields" })
@Generated("jsonschema2pojo")
public class Account {

	@JsonProperty("id")
	private String id;
	@JsonProperty("username")
	private String username;
	@JsonProperty("acct")
	private String acct;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("locked")
	private Boolean locked;
	@JsonProperty("bot")
	private Boolean bot;
	@JsonProperty("discoverable")
	private Boolean discoverable;
	@JsonProperty("group")
	private Boolean group;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("note")
	private String note;
	@JsonProperty("url")
	private String url;
	@JsonProperty("avatar")
	private String avatar;
	@JsonProperty("avatar_static")
	private String avatarStatic;
	@JsonProperty("header")
	private String header;
	@JsonProperty("header_static")
	private String headerStatic;
	@JsonProperty("followers_count")
	private Integer followersCount;
	@JsonProperty("following_count")
	private Integer followingCount;
	@JsonProperty("statuses_count")
	private Integer statusesCount;
	@JsonProperty("last_status_at")
	private String lastStatusAt;
	@JsonProperty("emojis")
	private List<Object> emojis = null;
	@JsonProperty("fields")
	private List<Object> fields = null;
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

	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}

	@JsonProperty("acct")
	public String getAcct() {
		return acct;
	}

	@JsonProperty("acct")
	public void setAcct(String acct) {
		this.acct = acct;
	}

	@JsonProperty("display_name")
	public String getDisplayName() {
		return displayName;
	}

	@JsonProperty("display_name")
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@JsonProperty("locked")
	public Boolean getLocked() {
		return locked;
	}

	@JsonProperty("locked")
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	@JsonProperty("bot")
	public Boolean getBot() {
		return bot;
	}

	@JsonProperty("bot")
	public void setBot(Boolean bot) {
		this.bot = bot;
	}

	@JsonProperty("discoverable")
	public Boolean getDiscoverable() {
		return discoverable;
	}

	@JsonProperty("discoverable")
	public void setDiscoverable(Boolean discoverable) {
		this.discoverable = discoverable;
	}

	@JsonProperty("group")
	public Boolean getGroup() {
		return group;
	}

	@JsonProperty("group")
	public void setGroup(Boolean group) {
		this.group = group;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("note")
	public String getNote() {
		return note;
	}

	@JsonProperty("note")
	public void setNote(String note) {
		this.note = note;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("avatar")
	public String getAvatar() {
		return avatar;
	}

	@JsonProperty("avatar")
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@JsonProperty("avatar_static")
	public String getAvatarStatic() {
		return avatarStatic;
	}

	@JsonProperty("avatar_static")
	public void setAvatarStatic(String avatarStatic) {
		this.avatarStatic = avatarStatic;
	}

	@JsonProperty("header")
	public String getHeader() {
		return header;
	}

	@JsonProperty("header")
	public void setHeader(String header) {
		this.header = header;
	}

	@JsonProperty("header_static")
	public String getHeaderStatic() {
		return headerStatic;
	}

	@JsonProperty("header_static")
	public void setHeaderStatic(String headerStatic) {
		this.headerStatic = headerStatic;
	}

	@JsonProperty("followers_count")
	public Integer getFollowersCount() {
		return followersCount;
	}

	@JsonProperty("followers_count")
	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}

	@JsonProperty("following_count")
	public Integer getFollowingCount() {
		return followingCount;
	}

	@JsonProperty("following_count")
	public void setFollowingCount(Integer followingCount) {
		this.followingCount = followingCount;
	}

	@JsonProperty("statuses_count")
	public Integer getStatusesCount() {
		return statusesCount;
	}

	@JsonProperty("statuses_count")
	public void setStatusesCount(Integer statusesCount) {
		this.statusesCount = statusesCount;
	}

	@JsonProperty("last_status_at")
	public String getLastStatusAt() {
		return lastStatusAt;
	}

	@JsonProperty("last_status_at")
	public void setLastStatusAt(String lastStatusAt) {
		this.lastStatusAt = lastStatusAt;
	}

	@JsonProperty("emojis")
	public List<Object> getEmojis() {
		return emojis;
	}

	@JsonProperty("emojis")
	public void setEmojis(List<Object> emojis) {
		this.emojis = emojis;
	}

	@JsonProperty("fields")
	public List<Object> getFields() {
		return fields;
	}

	@JsonProperty("fields")
	public void setFields(List<Object> fields) {
		this.fields = fields;
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

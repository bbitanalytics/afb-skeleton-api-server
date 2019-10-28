package com.afrilandfirstbank.api.skeleton.dao.entity;

import javax.persistence.*;

@Entity
public class ApiObject {

  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;
  private String description;
  private String url;
  private String link;
  private String token;

  public ApiObject() {
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(final String url) {
    this.url = url;
  }

  public String getLink() {
    return link;
  }

  public void setLink(final String link) {
    this.link = link;
  }

  public String getToken() {
    return token;
  }

  public void setToken(final String token) {
    this.token = token;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((url == null) ? 0 : url.hashCode());
    result = prime * result + ((link == null) ? 0 : link.hashCode());
    result = prime * result + ((token == null) ? 0 : token.hashCode());
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof ApiObject))
      return false;
    final ApiObject other = (ApiObject) obj;
        if (name == null) { if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        if (description == null) { if (other.description != null) return false;
        } else if (!description.equals(other.description)) return false;

        if (url == null) { if (other.url != null) return false;
        } else if (!url.equals(other.url)) return false;

        if (link == null) { if (other.link != null) return false;
        } else if (!link.equals(other.link)) return false;

        if (token == null) { if (other.token != null) return false;
        } else if (!token.equals(other.token)) return false;

        return true;
    }
}

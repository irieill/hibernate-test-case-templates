package org.hibernate.bugs;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity(name = "Group")
@Table(name = "\"Group\"")
public class Group implements Serializable {

  private static final long serialVersionUID = 3798948040535384440L;

  @Id
  @Column(name="\"order\"")
  private String order;

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

}

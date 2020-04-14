package kr.hs.dgsw.kakaoskill.database.model;

import java.sql.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "meal")
@Getter
@Setter
public class Meal {
  @Id 
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long idx;

  @Column(nullable = false, length = 30, name = "education_code")
  private String educationCode;

  @Column(nullable = false, length = 30, name = "school_name")
  private String schoolName;

  @Column(nullable = false, length = 30, name = "school_code")
  private String schoolCode;

  @Column(nullable = false, length = 1000)
  private String menu;

  @Column(nullable = false, length = 30, name = "meal_time")
  private String mealTime;

  @Column(nullable = false, name = "meal_date")
  private Date mealDate;
}
package beans;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_Id")
    private int id;

    @Column(name = "Student_Name",nullable = false,length = 50)
    private String name;

    @Column(name = "Student_Course",nullable = false,length = 60)
    private String course;

    @Embedded
    @Column(unique = true,nullable = false)
    private Rank std_rank;
}

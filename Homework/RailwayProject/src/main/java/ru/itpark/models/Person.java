package ru.itpark.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    @Column(name = "document_id")
    private Long documentId;
  //  @OneToOne @OneToOne
    //    @JoinColumn(name = "fk_document_id", referencedColumnName = "passport_id");
}

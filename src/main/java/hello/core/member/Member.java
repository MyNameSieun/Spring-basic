package hello.core.member;

// 회원 정보를 저장하는 클래스
public class Member {
    // 멤버 변수(필드): 클래스에 소속된 변수
    private Long id;
    private String name;
    private Grade grade;

    // 생성자
    public Member(Long id, String name, Grade grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    // Getter, Setter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}



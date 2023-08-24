package LikeLion_Back2_Class.week3.day2;

import LikeLion_Back2_Class.domain.Patient2;

import java.util.HashSet;
import java.util.Set;

public class Set02SolveDuplicate {

    public void testAddObject() {
        Patient2 patient1 = new Patient2("김경록", 36);
        Patient2 patient2 = new Patient2("김영환", 33);
        Patient2 patient3 = new Patient2("김영환", 33);

        Set<Patient2> setPatient = new HashSet<>();
        setPatient.add(patient1);
        setPatient.add(patient2);
        System.out.println(setPatient); //[domain.Patient@6d6f6e28, domain.Patient@7f31245a]
        // 중복되었다고 인식함 hashcode()
        setPatient.add(patient3);
        System.out.println(setPatient); //[domain.Patient@6d6f6e28, domain.Patient@7f31245a]
    }

    public static void main(String[] args) {
        // set은 중복을 허용하지 않습니다.
        HashSet<String> hs = new HashSet<>();
        hs.add("마이");
        hs.add("네임");
        hs.add("마이"); // 같은것을 넣으면 [네임, 마이] 이렇게 사라져 버립니다.
        System.out.println(hs);

        Set02SolveDuplicate s01 = new Set02SolveDuplicate();
        s01.testAddObject();

    }
}

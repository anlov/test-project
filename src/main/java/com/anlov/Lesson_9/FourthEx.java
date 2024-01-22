package com.anlov.Lesson_9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class FourthEx {
    Collection<FourthEx.Student> students = Arrays.asList(
            new FourthEx.Student("Дмитрий", 17, FourthEx.Gender.MAN),
            new FourthEx.Student("Максим", 20, FourthEx.Gender.MAN),
            new FourthEx.Student("Екатерина", 20, FourthEx.Gender.WOMAN),
            new FourthEx.Student("Михаил", 28, FourthEx.Gender.MAN)
    );

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, FourthEx.Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "(" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + ")";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
    public double average() {
        return students.stream().filter(g -> g.gender == FourthEx.Gender.MAN)
                .mapToInt(FourthEx.Student::getAge).summaryStatistics().getAverage();
    }
    public void army() {
        students.stream().filter(g -> g.gender == FourthEx.Gender.MAN).
                filter(g -> g.age >= 18 && g.age <= 27).forEach(g -> System.out.println(g.name));
    }
}

interface GFG {
    void learnCoding();

    void learnProgramming();

    void contribute();
}
    abstract class Student implements GFG {
        public void learnCoding() {
            System.out.println("Let's make coding a habit with CFG");
        }

        public void learnProgramming() {
            System.out.println("Let;s Learn Java");
        }
    }
        class GEEK extends Student {
            public void contribute() {
                System.out.println("Let's help others to Learn Java");
            }

            @Override
            public void learnCoding() {
                System.out.println("Let's make coding a habit with java");
            }
        }

        public class Main {
            public static void main (String[] args){
            GEEK gfgStudent = new GEEK();
            gfgStudent.learnCoding();
            gfgStudent.learnProgramming();
            gfgStudent.contribute();
        }
}
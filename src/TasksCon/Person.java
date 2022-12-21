package TasksCon;

    abstract class Person {

        private String name;
        private String surname;
        private Integer id;
        private Integer age;

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Integer getId() {
            return id;
        }



        public String getSurname() {
            return surname;
        }


        //getters


        public void print() {
        }

        public Person(String name,String surname,Integer age,Integer id){
            this.name = name;
            this.age = age;
            this.surname = surname;
            this.id = id;
        }

    }






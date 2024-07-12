public class NumberHolder {

    int number;

    //default
    NumberHolder(){
        this.number=10;
    }

    //paramet initializes num to provided value
    NumberHolder(int number){
        this.number = number;
    }

    //copy constructor makes a copy of provided obj
    NumberHolder(NumberHolder n){
        this.number = n.number;
    }


}

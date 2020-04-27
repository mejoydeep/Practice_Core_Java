package com.JavaPractice;

public class InnerClass4 {



    public void getInner(){

        //this local variable can't be public

        int sum=10;

        //Class inside a method

        class Inner{

            int divisor;
            int reminder;

            public Inner(int divisor) {
                this.divisor = divisor;
                this.reminder = sum%divisor;
            }

        }
        Inner inner=new Inner(2);
        System.out.println("Divisor: "+inner.divisor);
        System.out.println("Reminder: "+inner.reminder);
        System.out.println("Divident: "+sum/inner.divisor);

        if(sum/inner.divisor>3){

            //Class declaration inside a if/else statement
            class Inner2{
                private void getvalues(){
                    System.out.println("Inside inner of if statement");
                }
            }
            Inner2 inner2=new Inner2();
            inner2.getvalues();
        }
        else{
            System.out.println("Outside inner2 class");
        }

    }

    public static void main(String[] args) {
        InnerClass4 i=new InnerClass4();
        i.getInner();

    }
}

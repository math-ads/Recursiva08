package controller;

public class FatorialDuplo {
public FatorialDuplo() {
	super();}



 public int Fatorial(int num) {
	 if (num==0){
		 return 1;
 } else {
		 if (num%2!=0) {
			 return num * Fatorial(num-1);
		 }
		 else {
			 return Fatorial(num-1);
		 }
	 }
 }}
	


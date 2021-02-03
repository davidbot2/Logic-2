/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.pkg2;

/**
 *
 * @author DAVID
 */
public class Logic2 {

 public boolean makeBricks(int small, int big, int goal) {
  //si small por 1 sumado a big por 5 es menor que goal es falso
  if((small * 1)+(big * 5)< goal){
    return false;
  }
  //si la division de goal entre 5 es mayor que small es falso
  if(goal % 5 > small){
    return false;
  }
  //si no cumple ninguna de las anteriores es verdadero
  return true;
  }
 public int loneSum(int a, int b, int c) {
  //si son todos iguales regresa 0
  if(a==b && b ==c){
    return 0;
  }
  //si a = b retorna c
  if (a==b){
    return c;
  }
  //si a = c retorna b
  if (a==c){
    return b;
  }
  //si b = c retorna a
  if (b==c){
    return a;
  }
  //si no se culple ninguna de las anteriores se suman todas
  return a + b + c;
}
public int luckySum(int a, int b, int c) {
  //si a es 13 todo los que esta a su derecha no cuenta
  if(a==13){
    return 0;
  }
  //si b es 13 todo los que esta a su derecha no cuenta pero a su izquierda si
  if(b==13){
    return a;
  }
  //si c es 13, al ser el ultimo de los tres se suman a + b pero c no se cuenta
  if(c==13){
    return a + b;
  }
  //si en ninguna hay un 13 se suman todas
  return a + b +c;
}
 
 public int noTeenSum(int a, int b, int c) {
  //Funcion para desechar los valores que no quiero 13 al 19 sin contar con el 15 & 16
  
 int res = fixTeen(a, b, c);
 return res; 
}


 public int fixTeen(int _a, int _b, int _c){
   
   //Funcion que desecha los numeros
   
   if(_a>12 && _a<15){
    _a=0;
   }
   if(_b>12 && _b<15){
    _b=0;
   }
   if(_c>12 && _c<15){
    _c=0;
  }
  
   //Se devuelven los valores superiores al 16
   if(_a>16){
    _a=0;
   }
   if(_b>16){
    _b=0;
   }
   if(_c>16){
    _c=0;
   }
 return _a + _b + _c;
 }
 public int roundSum(int a, int b, int c) {
  a = round10(a);
  b = round10(b);
  c = round10(c);
    
    return a + b +c;
}
public int round10(int num) {
  //si el numero de la derecha es mayor o igual que 5 retornamos num mas 10 menos el numero de la derecha
	int n = num % 10;
	if(n >= 5){
		return num + (10 - n);
    }
	return num - n;
}

public boolean closeFar(int a, int b, int c) {
  //si al restar un int a otro int se ejecuta la accion se vuelve true sino false
  if(Math.abs(a - c)<=1 && Math.abs(a - b)>=2 && Math.abs(b - c)>=2 ){ 
    return true;
  }
  if(Math.abs(a - b)<=1 && Math.abs(b - c)>=2 && Math.abs(a - c)>=2){
    return true;
  }
return false;
} 
 public int blackjack(int a, int b) {
  //ponemos que si a es mayor que 21 se vuelve 0
  //si a es mayor que 21 y b es menor o igual que 21 se devuelve b
    if(a>21 && b<=21){
    return b;
    }
    //si b es mayor que 21 y a es menor o igual que 21 se devuelve a
    if(b>21 && a<=21){
      return a;
    }
    //si a es mayor que b y a es menor o igual que 21 se devuelve a
  if(a>b && a<=21){
    return a;
  }
  //si b es mayor que a y a es menor o igual que 21 se devuelve b
  if(b>a && a<=21 ){
    return b;
  }
  //si a o b es un numero mayor que 21 se devuelve 0 dicho numero
  return 0;
}

}

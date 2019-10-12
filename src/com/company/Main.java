package com.company;

public class Main {

    static class Kalash{
        int Oboyma = 30;                    //обойма 30 патронов
        int Rejim = 1;                      //режим стрельбы - одиночный

        void fire(){                            //Нажатие на курок
            if (Oboyma>0){                  //в магазине есть пули?
                if (Rejim == 1){            //да, режим одиночный?
                Oboyma-=1;                  //да, -1 пуля
                }
                else {                    //нет - (автомат)
                    if (Oboyma > 5) {       //патронов больше 5?
                        Oboyma -= 5;        //да, -5 пуль
                    }
                    else                  //нет
                        Oboyma = 0;         //выстрелить все остатки
                }
            }
            else                          //нет пуль
                System.out.println("Вставьте новый магазин");   //запрос замены магазина
        }

        void Reload() {             //Перезарядка
            if(Oboyma>0){       //В затворе есть патроны?
                Oboyma = 31;    //да, затвор + новый магазин
            }
            else Oboyma = 30;   // замена магазина на новый
        }

        void Swich(){                   //Смена режима стрельбы
            if (Rejim == 1){        //Режим одиночный?
                Rejim = 5;          //да, смена на автомат
            }
            else Rejim = 1;         //нет, установить одиночный
        }

    }

    public static void main(String[] args) {        // Тестирование стрельбы с отслеживанием магазина
	Kalash K1 = new Kalash();
        System.out.println(K1.Oboyma);
        K1.fire();
        System.out.println(K1.Oboyma);
        K1.Swich();
        K1.fire();
        System.out.println(K1.Oboyma);
        K1.Oboyma = 3;
        System.out.println(K1.Oboyma);
        K1.fire();
        System.out.println(K1.Oboyma);
        K1.fire();
        K1.Reload();
        System.out.println(K1.Oboyma);
        K1.Reload();
        System.out.println(K1.Oboyma);
        K1.Swich();
        K1.fire();
        System.out.println(K1.Oboyma);
    }
}

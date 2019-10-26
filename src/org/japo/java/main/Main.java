/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Calendar
        Calendar cal = Calendar.getInstance();

        //Constantes
        int TIEMPO_MIN = 0;

        //HORA ACTUAL DE CLASE
        int h = cal.get(Calendar.HOUR_OF_DAY);
        int m = cal.get(Calendar.MINUTE);
        int s = cal.get(Calendar.SECOND);

        //PASAR HORA ACTUAL A SEGUNDOS
        int tActual = h * 3600 + m * 60 + s;

        //HORA RANDOM
        int horaRnd = RND.nextInt(tActual - TIEMPO_MIN + 1) + TIEMPO_MIN;

        //CALCULAR TIEMPO DE CLASE
        int tClase = tActual - horaRnd;

        //PASAR HORA INICIO A Horas Minutos y Segundos
        int hIni = horaRnd / 3600;
        int mIni = horaRnd / 60 % 60;
        int sIni = horaRnd % 60 % 60;

        //PASAR HORA DE CLASE A Horas Minutos y Segundos 
        int hClase = tClase / 3600;
        int mClase = tClase / 60 % 60;
        int sClase = tClase % 60 % 60;

        //Mensaje                                               
        System.out.printf("Hora actual ......: %02d:%02d:%02d %n", h, m, s);
        System.out.printf("Hora inicio ......: %02d:%02d:%02d %n", hIni, mIni, sIni);
        System.out.printf("Tiempo de clase ..: %d:%02d:%02d %n", hClase, mClase, sClase);

    }//main

}//class

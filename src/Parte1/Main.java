package Parte1;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
	public static char aceptZ[] = new char[26];{
		aceptZ[0] = 'a';
		aceptZ[1] = 'b';
		aceptZ[2] = 'c';
		aceptZ[3] = 'd';
		aceptZ[4] = 'e';
		aceptZ[5] = 'f';
		aceptZ[6] = 'g';
		aceptZ[7] = 'h';
		aceptZ[8] = 'i';
		aceptZ[9] = 'j';
		aceptZ[10] = 'k';
		aceptZ[11] = 'l';
		aceptZ[12] = 'm';
		aceptZ[13] = 'n';
		aceptZ[14] = 'o';
		aceptZ[15] = 'p';
		aceptZ[16] = 'q';
		aceptZ[17] = 'r';
		aceptZ[18] = 's';
		aceptZ[19] = 't';
		aceptZ[20] = 'u';
		aceptZ[21] = 'v';
		aceptZ[22] = 'w';
		aceptZ[23] = 'x';
		aceptZ[24] = 'y';
		aceptZ[25] = 'z';
	}
	
	public static char mayus[] = new char[26];{
		aceptZ[0] = 'A';
		aceptZ[1] = 'B';
		aceptZ[2] = 'C';
		aceptZ[3] = 'D';
		aceptZ[4] = 'E';
		aceptZ[5] = 'F';
		aceptZ[6] = 'G';
		aceptZ[7] = 'H';
		aceptZ[8] = 'I';
		aceptZ[9] = 'J';
		aceptZ[10] = 'K';
		aceptZ[11] = 'L';
		aceptZ[12] = 'M';
		aceptZ[13] = 'N';
		aceptZ[14] = 'O';
		aceptZ[15] = 'P';
		aceptZ[16] = 'Q';
		aceptZ[17] = 'R';
		aceptZ[18] = 'S';
		aceptZ[19] = 'T';
		aceptZ[20] = 'U';
		aceptZ[21] = 'V';
		aceptZ[22] = 'W';
		aceptZ[23] = 'X';
		aceptZ[24] = 'Y';
		aceptZ[25] = 'Z';
	}
	
	public static char a_zAcentos[] = new char[31]; {
		a_zAcentos[0] = 'a';
		a_zAcentos[1] = 'b';
		a_zAcentos[2] = 'c';
		a_zAcentos[3] = 'd';
		a_zAcentos[4] = 'e';
		a_zAcentos[5] = 'f';
		a_zAcentos[6] = 'g';
		a_zAcentos[7] = 'h';
		a_zAcentos[8] = 'i';
		a_zAcentos[9] = 'j';
		a_zAcentos[10] = 'k';
		a_zAcentos[11] = 'l';
		a_zAcentos[12] = 'm';
		a_zAcentos[13] = 'n';
		a_zAcentos[14] = 'o';
		a_zAcentos[15] = 'p';
		a_zAcentos[16] = 'q';
		a_zAcentos[17] = 'r';
		a_zAcentos[18] = 's';
		a_zAcentos[19] = 't';
		a_zAcentos[20] = 'u';
		a_zAcentos[21] = 'v';
		a_zAcentos[22] = 'w';
		a_zAcentos[23] = 'x';
		a_zAcentos[24] = 'y';
		a_zAcentos[25] = 'z';
		a_zAcentos[26] = 'á';
		a_zAcentos[27] = 'é';
		a_zAcentos[28] = 'í';
		a_zAcentos[29] = 'ó';
		a_zAcentos[30] = 'ú';
	}
	
	
	//métodos que regresan los estados finales como String para el momento en el que el autómata los pida
	public static String a_cFinal() {
		return "17,18,19,20,21";
	}
	
	public static String d_fFinal() {
		return "23,24,25,26";
	}
	
	public static String g_iFinal() {
		return "15";
	}
	
	public static String j_lFinal() {
		return "17";
	}
	
	public static String m_oFinal() {
		return "9";
	}
	
	public static String p_rFinal() {
		return "13";
	}
	
	public static String s_uFinal() {
		return "15";
	}
	
	public static String v_xFinal() {
		return "17,18,19,20";
	}
	
	public static String y_zFinal() {
		return "11,12";
	}
	
	public static String acentosFinal() {
		return "31,32,33,34,35";
	}
	
	public static String a_cMayusFinal() {
		return "20,21";
	}
	
	public static String d_fMayusFinal() {
		return "24,25,26,27";
	}
	
	public static String g_iMayusFinal() {
		return "21,22,23,24";
	}
	
	public static String j_lMayusFinal() {
		return "20";
	}
	
	public static String m_oMayusFinal() {
		return "14";
	}
	
	public static String p_rMayusFinal() {
		return "11";
	}
	
	public static String s_uMayusFinal() {
		return "11";
	}
	
	public static String v_xMayusFinal() {
		return "12";
	}
	
	public static String y_zMayusFinal() {
		return "9";
	}
	
	//matrices para mayúsculas
	public static String[][] a_cMayus(String w){
		char alfa[] = {'A', 'B', 'C', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[23];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < alfa.length + 1; j++)
				matTrans[i][j] = "22";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//Alberto
			matTrans[1][1] = "1";
			matTrans[2][15] = "2";
			matTrans[3][5] = "3";
			matTrans[4][8] = "4";
			matTrans[5][21] = "5";
			matTrans[6][23] = "6";
			matTrans[7][18] = "20";
			//Antes
			matTrans[2][17] = "7";
			matTrans[8][23] = "8";
			matTrans[9][8] = "9";
			matTrans[10][22] = "20";
			
			//Bailar
			matTrans[1][2] = "10";
			matTrans[11][4] = "11";
			matTrans[12][12] = "12";
			matTrans[13][15] = "13";
			matTrans[14][4] = "14";
			matTrans[15][21] = "21";
			//Botar
			matTrans[11][18] = "15";
			matTrans[16][23] = "13";
			
			//Carlos
			matTrans[1][3] = "16";//C
			matTrans[17][4] = "17";//a
			matTrans[18][21] = "18";//r
			matTrans[19][15] = "19";//l
			matTrans[20][18] = "9";//o
			//Cavar
			matTrans[18][25] = "13";
			
			return matTrans;
			
	}
	
	public static String[][] d_fMayus(String w){
		char alfa[] = {'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[29];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < alfa.length + 1; j++)
				matTrans[i][j] = "29";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//David:
			matTrans[1][1] = "1";//D
			matTrans[2][4] = "2";//a
			matTrans[3][25] = "3";//v
			matTrans[4][12] = "4";//i
			matTrans[5][7] = "24";//d
			//Donas
			matTrans[2][18] = "5";
			matTrans[6][17] = "6";
			matTrans[7][4] = "7";
			matTrans[8][22] = "25";
			
			//Eros
			matTrans[1][2] = "8";
			matTrans[9][21] = "9";
			matTrans[10][18] = "7";
			
			//Fernando
			matTrans[1][3] = "15";
			matTrans[16][8] = "16";
			matTrans[17][21] = "17";
			matTrans[18][17] = "18";
			matTrans[19][4] = "20";
			matTrans[21][7] = "21";
			matTrans[22][18] = "26";
			//Felipe
			matTrans[17][15] = "22";
			matTrans[23][12] = "23";
			matTrans[24][19] = "24";
			matTrans[25][8] = "27";
			
			
			return matTrans;
	}
	
	public static String[][] g_iMayus(String w){
		char alfa[] = {'G', 'H', 'I', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[26];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < alfa.length + 1; j++)
				matTrans[i][j] = "25";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//Gael
			matTrans[1][1] = "1";
			matTrans[2][4] = "2";
			matTrans[3][8] = "3";
			matTrans[4][15] = "21";
			//Gracias
			matTrans[2][21] = "4";
			matTrans[5][4] = "5";
			matTrans[6][6] = "6";
			matTrans[7][12] = "7";
			matTrans[8][4] = "8";
			matTrans[9][22] = "22";
			
			//Humberto
			matTrans[1][2] = "9";
			matTrans[10][24] = "10";
			matTrans[11][16] = "11";
			matTrans[12][5] = "12";
			matTrans[13][8] = "13";
			matTrans[14][21] = "14";
			matTrans[15][23] = "15";
			matTrans[16][18] = "23";
			//Heriberto
			matTrans[10][8] = "16";
			matTrans[17][21] = "17";
			matTrans[18][12] = "11";
			
			//Itzel
			matTrans[1][3] = "18";
			matTrans[19][23] = "19";
			matTrans[20][29] = "20";
			matTrans[21][8] = "3";
			//Ir
			matTrans[19][21] = "24";
			
			return matTrans;
	}

	public static String[][] j_lMayus(String w){
		char alfa[] = {'J', 'K', 'L', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[22];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < alfa.length + 1; j++)
				matTrans[i][j] = "21";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//Joel
			matTrans[1][1] = "1";
			matTrans[2][18] = "2";
			matTrans[3][8] = "3";
			matTrans[4][15] = "20";
			//Jarabe
			matTrans[2][4] = "4";
			matTrans[5][21] = "5";
			matTrans[6][4] = "6";
			matTrans[7][5] = "7";
			matTrans[8][8] = "20";
			
			//Karen
			matTrans[1][2] = "8";
			matTrans[9][4] = "9";
			matTrans[10][21] = "10";
			matTrans[11][8] = "11";
			matTrans[12][17] = "20";
			//Kareli
			matTrans[12][15] = "12";
			matTrans[13][12] = "20";
			
			//Letras
			matTrans[1][3] = "13";
			matTrans[14][8] = "14";
			matTrans[15][23] = "15";
			matTrans[16][21] = "16";
			matTrans[17][4] = "17";
			matTrans[18][22] = "20";
			//Lava
			matTrans[14][4] = "18";
			matTrans[19][25] = "19";
			matTrans[20][4] = "20";
			
			return matTrans;
			
	}
	
	public static String[][] m_oMayus(String w){
		char alfa[] = {'M', 'N', 'O', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[16];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < alfa.length + 1; j++)
				matTrans[i][j] = "15";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//Marco/Mario
			matTrans[1][1] = "1";
			matTrans[2][4] = "2";
			matTrans[3][21] = "3";
			matTrans[4][6] = "4";
			matTrans[4][12] = "4";
			matTrans[5][18] = "14";
			
			//Nuevo
			matTrans[1][2] = "5";
			matTrans[6][24] = "6";
			matTrans[7][8] = "7";
			matTrans[8][25] = "4";
			//Nada
			matTrans[6][4] = "8";
			matTrans[9][7] = "9";
			matTrans[10][4] = "14";
			
			//Orden
			matTrans[1][3] = "10";
			matTrans[11][21] = "11";
			matTrans[12][7] = "12";
			matTrans[13][8] = "13";
			matTrans[14][17] = "14";
			//Oso
			matTrans[11][22] = "4";
			
			
			return matTrans;
			
	}

	public static String[][] p_rMayus(String w){
		char alfa[] = {'P', 'Q', 'R', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[13];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < alfa.length + 1; j++)
				matTrans[i][j] = "12";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//Paz
			matTrans[1][1] = "1";
			matTrans[2][4] = "2";
			matTrans[3][29] = "11";
			//Paola/Paolo
			matTrans[3][18] = "3";
			matTrans[4][15] = "4";
			matTrans[5][4] = "11";
			matTrans[5][18] = "11";
			
			//Quiero/Quiera
			matTrans[1][2] = "5";
			matTrans[6][24] = "6";
			matTrans[7][12] = "7";
			matTrans[8][8] = "8";
			matTrans[9][21] = "4";
			
			//Rayo/Raya
			matTrans[1][3] = "9";
			matTrans[10][4] = "10";
			matTrans[11][28] = "4";
			
			
			return matTrans;
	}
	
	public static String[][] s_uMayus(String w){
		char alfa[] = {'S', 'T', 'U', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[13];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < alfa.length + 1; j++)
				matTrans[i][j] = "12";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//Silla
			matTrans[1][1] = "1";
			matTrans[2][12] = "2";
			matTrans[3][15] = "3";
			matTrans[4][15] = "4";
			matTrans[5][4] = "11";
			//Sopa
			matTrans[2][18] = "5";
			matTrans[6][19] = "4";
			
			//Tela
			matTrans[1][2] = "6";
			matTrans[7][8] = "3";
			//Taza
			matTrans[7][4] = "7";
			matTrans[8][29] = "4";
			
			//Uva
			matTrans[1][3] = "8";
			matTrans[9][25] = "4";
			//Unir
			matTrans[9][17] = "9";
			matTrans[10][12] = "10";
			matTrans[11][21] = "11";
			
			
			
			return matTrans;
	}

	public static String[][] v_xMayus(String w){
		char alfa[] = {'V', 'W', 'X', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[14];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < alfa.length + 1; j++)
				matTrans[i][j] = "13";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//Vela
			matTrans[1][1] = "1";
			matTrans[2][8] = "2";
			matTrans[3][15] = "3";
			matTrans[4][4] = "12";
			//Vello
			matTrans[4][15] = "4";
			matTrans[5][18] = "12";
			
			//Wiki
			matTrans[1][2] = "5";
			matTrans[6][12] = "6";
			matTrans[7][14] = "7";
			matTrans[8][12] = "12";
			//Web
			matTrans[6][8] = "8";
			matTrans[9][5] = "12";
			
			//Xolo
			matTrans[1][3] = "9";
			matTrans[10][18] = "10";
			matTrans[11][15] = "4";
			//Xeno
			matTrans[10][8] = "12";
			matTrans[13][17] = "4";
			
			return matTrans;
	}
	
	public static String[][] y_zMayus(String w){
		char alfa[] = {'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[11];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < alfa.length + 1; j++)
				matTrans[i][j] = "10";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//Yeso
			matTrans[1][1] = "1";
			matTrans[2][7] = "2";
			matTrans[3][21] = "3";
			matTrans[4][17] = "9";
			//Yoga
			matTrans[2][17] = "4";
			matTrans[5][9] = "5";
			matTrans[6][3] = "9";
			
			//Zamba/Zumba
			matTrans[1][2] = "6";
			matTrans[7][3] = "7";
			matTrans[7][23] = "7";
			matTrans[8][15] = "8";
			matTrans[9][4] = "5";
			
			return matTrans;
			
	}
	
	//métodos que regresan la matriz de los autómatas de x letra -> y letra para ser ingresada en el AFD
	public static String[][] a_cMat(String w) {
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[23];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][aceptZ.length + 1];
		
			for(int i = 0; i < estados.length + 1; i++) {
				for(int j = 0; j < aceptZ.length + 1; j++)
				matTrans[i][j] = "22";
			}
	    	for(int i = 1; i < estados.length+1; i++) {
	    		matTrans[i][0] = "";
	    		matTrans[i][0] += i-1;
	    	}
	      	for(int i = 1; i < alfa.length + 1; i++) {
	      		matTrans[0][i] = "" ;
	      		matTrans[0][i] += alfa[i-1] ;
	      	}
			matTrans[0][0] = "";
			
			//transiciones palabras de 'a'
		    matTrans[1][1] = "1";
	        matTrans[2][10] = "2";
	        matTrans[4][15] = "4";
	        matTrans[18][12] = "3";
	        matTrans[3][15] = "17";
	        matTrans[5][20] = "5";
	        matTrans[6][5] = "18";
	        
	        //transiciones palabras de 'b'
	        matTrans[7][1] = "1";
	        matTrans[1][2] = "6";
	        matTrans[7][21] = "7";
	        matTrans[8][5] = "8";
	        matTrans[9][25] = "19";
	        
	        //transiciones palabras de 'c'
	        matTrans[1][3] = "9";
	        matTrans[10][1] = "10";
	        matTrans[11][18] = "11";
	        matTrans[12][1] = "14";
	        matTrans[12][12] = "12";
	        matTrans[15][3] = "15";
	        matTrans[16][15] = "16";
	        matTrans[17][12] = "21";
	        matTrans[13][15] = "13";
	        matTrans[14][19] = "20";
	
			return matTrans;
	}
	
	public static String[][] d_fMat(String w){
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[27];
		
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		
		String matTrans[][] = new String[estados.length + 1][aceptZ.length + 1];
		
		for(int i = 0; i < estados.length + 1; i++) {
			for(int j = 0; j < aceptZ.length + 1; j++)
			matTrans[i][j] = "27";
		}
    	for(int i = 1; i < estados.length+1; i++) {
    		matTrans[i][0] = "";
    		matTrans[i][0] += i-1;
    	}
      	for(int i = 1; i < alfa.length + 1; i++) {
      		matTrans[0][i] = "" ;
      		matTrans[0][i] += alfa[i-1] ;
      	}
		matTrans[0][0] = "";
		
		//palabras con d
		matTrans[1][4] = "1";
		matTrans[2][15] = "2";
		matTrans[3][12] = "3";
		matTrans[3][18] = "5";
		matTrans[4][0] = "4";
		matTrans[6][13] = "6";
		matTrans[7][9] = "7";
		matTrans[8][18] = "25";
		
		//palabras con e
		matTrans[1][5] = "7";
		matTrans[8][19] = "8";
		matTrans[9][20] = "9";
		matTrans[10][18] = "10";
		matTrans[11][21] = "11";
		matTrans[12][5] = "12";
		matTrans[13][14] = "13";
		matTrans[14][4] = "14";
		matTrans[15][15] = "24";
		
		matTrans[10][15] = "15";
		matTrans[16][18] = "16";
		matTrans[17][14] = "17";
		matTrans[18][21] = "13";
		
		//palabras con f
		matTrans[1][6] = "18";
		matTrans[19][5] = "19";
		matTrans[20][12] = "20";
		matTrans[21][9] = "21";
		matTrans[22][16] = "22";
		matTrans[22][26] = "26";
		matTrans[23][5] = "25";
		
		
		return matTrans;
	}

	public static String[][] g_iMat(String w){
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[16];
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		for(int i = 0; i < estados.length + 1; i++) {
			for(int j = 0; j < aceptZ.length + 1; j++)
			matTrans[i][j] = "16";
		}
    	for(int i = 1; i < estados.length+1; i++) {
    		matTrans[i][0] = "";
    		matTrans[i][0] += i-1;
    	}
      	for(int i = 1; i < alfa.length + 1; i++) {
      		matTrans[0][i] = "" ;
      		matTrans[0][i] += alfa[i-1] ;
      	}
		
      	matTrans[0][0] = "";
		//palabras con g:
		matTrans[1][7] = "1";
		matTrans[2][1] = "2";
		matTrans[3][20] = "3";
		matTrans[4][15] = "15";
		
		matTrans[3][14] = "4";
		matTrans[5][19] = "3";
		
		//palabras con h:
		matTrans[1][8] = "5";
		matTrans[6][9] = "6";
		matTrans[7][5] = "7";
		matTrans[7][12] = "3";
		matTrans[8][12] = "3";
		
		//palabras con i:
		matTrans[1][9] = "8";
		matTrans[9][12] = "9";
		matTrans[10][5] = "10";
		matTrans[11][7] = "11";
		matTrans[11][19] = "3";
		matTrans[12][9] = "12";
		matTrans[13][2] = "13";
		matTrans[14][12] = "14";
		matTrans[15][5] = "15";
		
		return matTrans;
		
		
	}
	
	public static String[][] j_lMat(String w){
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[18];
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		for(int i = 0; i < estados.length + 1; i++) {
			for(int j = 0; j < aceptZ.length + 1; j++)
			matTrans[i][j] = "18";
		}
    	for(int i = 1; i < estados.length+1; i++) {
    		matTrans[i][0] = "";
    		matTrans[i][0] += i-1;
    	}
      	for(int i = 1; i < alfa.length + 1; i++) {
      		matTrans[0][i] = "" ;
      		matTrans[0][i] += alfa[i-1] ;
      	}
		
      	matTrans[0][0] = "";
      	//palabras con j:
      	matTrans[1][10] = "1";
      	matTrans[2][1] = "2";
      	matTrans[3][12] = "3";
      	matTrans[4][1] = "5";
      	matTrans[4][5] = "4";
      	matTrans[5][1] = "17";
      	matTrans[6][18] = "17";
      	
      	//palabras con k:
      	matTrans[1][11] = "6";
      	matTrans[7][1] = "7";
      	matTrans[8][18] = "8";
      	matTrans[9][1] = "9";
      	matTrans[10][20] = "10";
      	matTrans[11][5] = "17";
      	matTrans[10][15] = "11";
      	matTrans[12][11] = "10";
      	
      	//palabras con l:
      	matTrans[1][12] = "12";
      	matTrans[13][5] = "13";
      	matTrans[14][3] = "14";
      	matTrans[15][8] = "15";
      	matTrans[16][5] = "17";
      	matTrans[16][21] = "16";
      	matTrans[17][7] = "4";
      	
      	return matTrans;
 	}
	
	public static String[][] m_oMat(String w){
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[18];
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		for(int i = 0; i < estados.length + 1; i++) {
			for(int j = 0; j < aceptZ.length + 1; j++)
			matTrans[i][j] = "17";
		}
    	for(int i = 1; i < estados.length+1; i++) {
    		matTrans[i][0] = "";
    		matTrans[i][0] += i-1;
    	}
      	for(int i = 1; i < alfa.length + 1; i++) {
      		matTrans[0][i] = "" ;
      		matTrans[0][i] += alfa[i-1] ;
      	}
		
      	matTrans[0][0] = "";
      	//palabras con m:
      	matTrans[1][13] = "1";
      	matTrans[2][15] = "2";
      	matTrans[3][4] = "3";
      	matTrans[4][21] = "4";
      	matTrans[5][12] = "5";
      	matTrans[6][1] = "6";
      	matTrans[7][18] = "9";
      	matTrans[4][5] = "7";
      	matTrans[8][12] = "8";
      	matTrans[9][15] = "9";
      	
      	//palabras con n:
      	matTrans[1][14] = "9";
      	matTrans[10][1] = "10";
      	matTrans[11][18] = "11";
      	matTrans[12][1] = "12";
      	matTrans[13][14] = "13";
      	matTrans[14][10] = "14";
      	matTrans[15][1] = "9";
      	matTrans[11][22] = "12";
      	matTrans[13][1] = "13";
      	
      	//palabras con o:
      	matTrans[1][15] = "15";
      	matTrans[16][18] = "16";
      	matTrans[16][22] = "16";
      	matTrans[17][5] = "13";
      	
      	return matTrans;
	}
	
	public static String[][] p_rMat(String w){
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[15];
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		for(int i = 0; i < estados.length + 1; i++) {
			for(int j = 0; j < aceptZ.length + 1; j++)
			matTrans[i][j] = "14";
		}
    	for(int i = 1; i < estados.length+1; i++) {
    		matTrans[i][0] = "";
    		matTrans[i][0] += i-1;
    	}
      	for(int i = 1; i < alfa.length + 1; i++) {
      		matTrans[0][i] = "" ;
      		matTrans[0][i] += alfa[i-1] ;
      	}
		
      	matTrans[0][0] = "";
      	//pera
      	matTrans[1][16] = "1";
      	matTrans[2][5] = "2";
      	matTrans[3][18] = "3";
      	matTrans[4][1] = "13";
      	//pan
      	matTrans[2][1] = "4";
      	matTrans[5][14] = "13";
      	
      	//queso
      	matTrans[1][17] = "5";
      	matTrans[6][21] = "6";
      	matTrans[7][5] = "7";
      	matTrans[8][19] = "8";
      	matTrans[9][15] = "13";
      	//quieto
      	matTrans[7][9] = "9";
      	matTrans[10][5] = "10";
      	matTrans[11][20] = "8";
      	
      	//rana
      	matTrans[1][18] = "11";
      	matTrans[12][1] = "12";
      	matTrans[13][14] = "3";
      	//rayo
      	matTrans[13][25] = "8";
      	
      	
      	return matTrans;
	}
	
	public static String[][] s_uMat(String word){
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[17];
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		for(int i = 0; i < estados.length + 1; i++) {
			for(int j = 0; j < alfa.length + 1; j++)
			matTrans[i][j] = "16";
		}
    	for(int i = 1; i < estados.length+1; i++) {
    		matTrans[i][0] = "";
    		matTrans[i][0] += i-1;
    	}
      	for(int i = 1; i < alfa.length + 1; i++) {
      		matTrans[0][i] = "" ;
      		matTrans[0][i] += alfa[i-1] ;
      	}
		
      	matTrans[0][0] = "";
      	//salchicha
      	matTrans[1][19] = "1";
      	matTrans[2][1] = "2";
      	matTrans[3][12] = "3";
      	matTrans[4][3] = "4";
      	matTrans[5][8] = "5";
      	matTrans[6][9] = "6";
      	matTrans[7][3] = "7";
      	matTrans[8][8] = "8";
      	matTrans[9][1] = "15";
      	//salsa
      	matTrans[4][19] = "8";
      	
      	//tabla
      	matTrans[1][20] = "9";
      	matTrans[10][1] = "10";
      	matTrans[11][2] = "11";
      	matTrans[12][12] = "8";
      	//tapa
      	matTrans[11][16] = "8";
      	
      	//urna
      	matTrans[1][21] = "12";
      	matTrans[13][18] = "13";
      	matTrans[14][14] = "8";
      	//urbe
      	matTrans[14][2] = "14";
      	matTrans[15][5] = "15";
      	
      	
      	return matTrans;
	}
	
	public static String[][] v_xMat(String w){
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[23];
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		for(int i = 0; i < estados.length + 1; i++) {
			for(int j = 0; j < alfa.length + 1; j++)
			matTrans[i][j] = "22";
		}
    	for(int i = 1; i < estados.length+1; i++) {
    		matTrans[i][0] = "";
    		matTrans[i][0] += i-1;
    	}
      	for(int i = 1; i < alfa.length + 1; i++) {
      		matTrans[0][i] = "" ;
      		matTrans[0][i] += alfa[i-1] ;
      	}
		
      	matTrans[0][0] = "";
      	//valor
      	matTrans[1][22] = "1";
      	matTrans[2][1] = "2";
      	matTrans[3][12] = "3";
      	matTrans[4][15] = "4";
      	matTrans[5][18] = "17";
      	//vector
      	matTrans[2][5] = "5";
      	matTrans[6][3] = "6";
      	matTrans[7][20] = "3";
      	
      	//wafle/waffle
      	matTrans[1][23] = "7";
      	matTrans[8][1] = "8";
      	matTrans[9][6] = "9";
      	matTrans[10][6] = "9";
      	matTrans[10][12] = "10";
      	matTrans[11][5] = "18";
      	//wifi
      	matTrans[8][9] = "11";
      	matTrans[12][6] = "12";
      	matTrans[13][9] = "19";
      	
      	//xolo
      	matTrans[1][24] = "13";
      	matTrans[14][15] = "14";
      	matTrans[15][12] = "15";
      	matTrans[16][15] = "20";
      	//xeno
      	matTrans[14][5] = "16";
      	matTrans[17][14] = "15";
    
      	return matTrans;
	}
	
	public static String[][] y_zMat(String w){
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int estados[] =  new int[14];
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		String matTrans[][] = new String[estados.length + 1][alfa.length + 1];
		for(int i = 0; i < estados.length + 1; i++) {
			for(int j = 0; j < alfa.length + 1; j++)
			matTrans[i][j] = "13";
		}
    	for(int i = 1; i < estados.length+1; i++) {
    		matTrans[i][0] = "";
    		matTrans[i][0] += i-1;
    	}
      	for(int i = 1; i < alfa.length + 1; i++) {
      		matTrans[0][i] = "" ;
      		matTrans[0][i] += alfa[i-1] ;
      	}
		
      	matTrans[0][0] = "";
      	
      	//yeso
      	matTrans[1][25] = "1";
      	matTrans[2][5] = "2";
      	matTrans[3][19] = "3";
      	matTrans[4][15] = "11";
      	//yerno
      	matTrans[3][18] = "4";
      	matTrans[5][14] = "3";
      	
      	//zurdo
      	matTrans[1][26] = "5";
      	matTrans[6][21] = "6";
      	matTrans[7][18] = "7";
      	matTrans[8][4] = "3";
      	//zorra
      	matTrans[6][15] = "8";
      	matTrans[9][18] = "9";
      	matTrans[10][18] = "10";
      	matTrans[11][1] = "12";
      	
      	return matTrans;
	}
	
	public static String[][] acentos(String w){
		char alfa[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'á', 'é', 'í', 'ó', 'ú'};
		int estados[] =  new int[37];
		for(int i = 0; i < estados.length; i++) {
			estados[i] = i;
		}
		String matTrans[][] = new String[estados.length + 1][a_zAcentos.length + 1];
		for(int i = 0; i < estados.length + 1; i++) {
			for(int j = 0; j < a_zAcentos.length + 1; j++)
			matTrans[i][j] = "37";
		}
    	for(int i = 1; i < estados.length+1; i++) {
    		matTrans[i][0] = "";
    		matTrans[i][0] += i-1;
    	}
      	for(int i = 1; i < alfa.length + 1; i++) {
      		matTrans[0][i] = "" ;
      		matTrans[0][i] += alfa[i-1] ;
      	}
		
      	matTrans[0][0] = "";
      	//palabras con acento en la a:
      	//árbol
      	matTrans[1][27] = "1";
      	matTrans[2][18] = "2";
      	matTrans[3][2] = "3";
      	matTrans[4][15] = "4";
      	matTrans[5][12] = "31";
      	//lámina
      	matTrans[1][12] = "5";//l
      	matTrans[6][27] = "6";//á
      	matTrans[7][13] = "7";//m
      	matTrans[8][9] = "8";//i
      	matTrans[9][14] = "9";//n
      	matTrans[10][1] = "32";//a
      	
      	//palabras con acento en la e:
      	//pésima
      	matTrans[1][16] = "10";
      	matTrans[11][28] = "11";
      	matTrans[12][19] = "12";
      	matTrans[13][9] = "13";
      	matTrans[14][13] = "9";
      	//pérdida
      	matTrans[12][18] = "14";
      	matTrans[15][4] = "15";
      	matTrans[16][9] = "16";
      	matTrans[17][4] = "9";
      	
      	//palabras con acento en la o:
      	//cólico
      	matTrans[1][3] = "17";//c
      	matTrans[18][30] = "18";//ó
      	matTrans[19][12] = "19";//l
      	matTrans[20][9] = "20";//i
      	matTrans[21][3] = "21";//c
      	matTrans[22][15] = "33";//o
      	//código
      	matTrans[19][4] = "22";
      	matTrans[23][9] = "23";
      	matTrans[24][7] = "21";
      	
      	//palabras con acento en la i:
      	//país:
      	matTrans[11][1] = "24";
      	matTrans[25][29] = "25";
      	matTrans[26][19] = "34";
      	//raíz
      	matTrans[1][18] = "26";
      	matTrans[27][1] = "27";
      	matTrans[28][29] = "28";
      	matTrans[29][26] = "35";
      	
      	//palabras con acento en la ú:
      	//púa:
      	matTrans[11][31] = "9";
      	//grúa:
      	matTrans[1][7] = "29";
      	matTrans[30][31] = "9";
      	
 
      	
      	return matTrans;
	}
	
	//AFD
	public static boolean verificador(String matriz[][], int numEst, String finals, String pal) {
		String estadoi = "0";
		String estadof = finals;
		char[] fin = estadof.toCharArray();
		
		//do {

			//String pal = JOptionPane.showInputDialog("palabra a revisar");
			char[] pala = pal.toCharArray();
			String[] palabra = new String[pal.length()];

			for (int i = 0; i < pal.length(); i++) {
				//if(pal.charAt(i) == '.' || pal.charAt(i) == ',' || pal.charAt(i) == '!' || pal.charAt(i) == '_' || pal.charAt(i) == '?')
					//punto++;
				palabra[i] = "";
				palabra[i] += pala[i];
				//System.out.print(palabra[i]);	
		
			}

			int columna = 0, fila = 0;
			String estadopaso = estadoi;
			//System.out.println(matriz[0].length);
			//System.out.println(matriz.length);
			for (int p = 0; p < palabra.length; p++) {
				for (int e = 1; e < matriz.length; e++) {

					// System.out.println(matriz[e][0] + " " + estadopaso);
					if (matriz[e][0].compareTo(estadopaso) == 0) {
						columna = e;
					}
					// System.out.println("columna lista");

				}
				for (int q = 1; q < matriz[0].length; q++) {

					// System.out.println(matriz[0][q] + " " + palabra[p]);
					if (matriz[0][q].compareTo(palabra[p]) == 0) {
						fila = q;
					}

				}
				estadopaso = matriz[columna][fila];
			}
				
			int comaf=0,cambio3=0,res=0;
			
			for (int i = 0; i < fin.length; i++) {

				if (fin[i] == ',')
					comaf++;
			}
			comaf++;
			//System.out.println(comaf);
			String[] f=new String[comaf];
			for (int i = 0; i < fin.length; i++) {

				if (fin[i] != ',') {
					if (f[cambio3] == null) {
						f[cambio3] = "";
					} else
						;
					f[cambio3] += fin[i];
				} else {
					cambio3++;
				}
			}
			//System.out.println("problema2");
			for(int i=0;i<f.length;i++) {
				if(f[i].compareTo(estadopaso)==0)
					res=1;
			}
			if (res == 1)
				return true;
			else
				return false;
	}
	
	//función que quita comas y puntos
	public static String retWord(String w) {
		int puntos = 0;
		for(int i = 0; i < w.length(); i++) {
			if(w.charAt(i) == '.' || w.charAt(i) == ',')
				puntos++;
		}
		
		if(puntos != 0) {
			char[] word = new char[w.length() - puntos];
		

			
			for(int i = 0; i < w.length() - 1; i++) {
				word[i] = w.charAt(i);
			}
			
			String finalWord = "";
			for(int i = 0; i < word.length; i++) {
				finalWord += word[i];
			}
			
			return finalWord;
		}
		
		return w;
	}
	
	//cantidad de palabras
	public static int getNumbWords(File f) {
		int i = 0;
		String line;
		try {
			Scanner input = new Scanner(f);
            while (input.hasNext()) {
            	line = input.next();
                i++;
            }
            input.close();
        }
		catch(Exception ex) {
			System.err.format("X");
		}
		System.out.println(i);
		return i;
		
	}
	
	public static String[] getWords(File f) {
		
		int cant = getNumbWords(f);
		String words[] = new String[cant];
		String line;
		int i = 0;
		
		try {
			Scanner input = new Scanner(f);
            while (input.hasNext()) {
            	line = input.next();
            	words[i] = retWord(line);
                i++;
            }
            input.close();
        }
		catch(Exception ex) {
			System.err.format("X");
		}
		
		return words;
	}
	
	public static void main(String[] args) {
		
		String matriz[][] = null;
		String estFinales = "";
		int numEstados = 0;
		boolean accept = false;
		
		int acentos = 0;
		
		File file = new File("captmidn.txt");
		
		String words[] = getWords(file);
		String word = "";
		
		//do {
		for(int j = 0; j < words.length; j++) {
				word = words[j];
				//System.out.println(word);

				
				for(int i = 0; i < word.length(); i++) {
					if(word.charAt(i) == 'á' || word.charAt(i) == 'é' || word.charAt(i) == 'í' || word.charAt(i) == 'ó' || word.charAt(i) == 'ú') {
						acentos = 1;
					}
				}
		
				if(acentos == 1) {
					matriz = acentos(word);
					estFinales = acentosFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
					acentos = 0;
				}
			
				else if(word.charAt(0) == 'a' || word.charAt(0) == 'b' || word.charAt(0) == 'c') {
					matriz = a_cMat(word);
					estFinales = a_cFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'd' || word.charAt(0) == 'e' || word.charAt(0) == 'f') {
					matriz = d_fMat(word);
					estFinales = d_fFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");;
				}
				else if(word.charAt(0) == 'g' || word.charAt(0) == 'h' || word.charAt(0) == 'i') {
					matriz = g_iMat(word);
					estFinales = g_iFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'j' || word.charAt(0) == 'k' || word.charAt(0) == 'l') {
					matriz = j_lMat(word);
					estFinales = j_lFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'm' || word.charAt(0) == 'n' || word.charAt(0) == 'o') {
					matriz = m_oMat(word);
					estFinales = m_oFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'p' || word.charAt(0) == 'q' || word.charAt(0) == 'r') {
					matriz = p_rMat(word);
					estFinales = p_rFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 's' || word.charAt(0) == 't' || word.charAt(0) == 'u') {
					matriz = s_uMat(word);
					estFinales = s_uFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'v' || word.charAt(0) == 'w' || word.charAt(0) == 'x') {
					matriz = v_xMat(word);
					estFinales = v_xFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'y' || word.charAt(0) == 'z') {
					matriz = y_zMat(word);
					estFinales = y_zFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'A' || word.charAt(0) == 'B' || word.charAt(0) == 'C') {
					matriz = a_cMayus(word);
					estFinales = a_cMayusFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
					
				}
				else if(word.charAt(0) == 'D' || word.charAt(0) == 'E' || word.charAt(0) == 'F') {
					matriz = d_fMayus(word);
					estFinales = d_fMayusFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'G' || word.charAt(0) == 'H' || word.charAt(0) == 'I') {
					matriz = g_iMayus(word);
					estFinales = g_iMayusFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'J' || word.charAt(0) == 'K' || word.charAt(0) == 'L') {
					matriz = j_lMayus(word);
					estFinales = j_lMayusFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'M' || word.charAt(0) == 'N' || word.charAt(0) == 'O') {
					matriz = m_oMayus(word);
					estFinales = m_oMayusFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'P' || word.charAt(0) == 'Q' || word.charAt(0) == 'R') {
					matriz = p_rMayus(word);
					estFinales = p_rMayusFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'S' || word.charAt(0) == 'T' || word.charAt(0) == 'U') {
					matriz = s_uMayus(word);
					estFinales = s_uMayusFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'V' || word.charAt(0) == 'W' || word.charAt(0) == 'X') {
					matriz = v_xMayus(word);
					estFinales = v_xMayusFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
				else if(word.charAt(0) == 'Y' || word.charAt(0) == 'Z') {
					matriz = y_zMayus(word);
					estFinales = y_zMayusFinal();
					numEstados = matriz[0].length;
					accept = verificador(matriz, numEstados, estFinales, word);
					if(accept == false)
						System.out.println("La palabra " + word + " está mal escrita");
				}
			
		}
		


	}
}


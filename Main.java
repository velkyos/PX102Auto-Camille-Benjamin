// Code appartenant à Benjamin Robert, 1A esisar, ne pas copier sans autorisation//


package Class;
import processing.core.PApplet;
import Class.Fct;

public class Main extends PApplet {
	///Variable//
	boolean Det_et_1=false;
	boolean Det_et_2=false;
	boolean Det_et_3=false;
	boolean Det_et_4=false;
	boolean Det_et_5=false;
	boolean Porte_et1=true;
	boolean Porte_et2=true;
	boolean Porte_et3=true;
	boolean Porte_et4=true;
	boolean Porte_et5=true;
	boolean Cmd_r_s=false;
	boolean Bp_atu=false;
	boolean Ap_cab_1=false;
	boolean Ap_cab_2=false;
	boolean Ap_cab_3=false;
	boolean Ap_cab_4=false;
	boolean Ap_cab_5=false;
	boolean Mont_cab=false;
	boolean Desc_cab=false;
	boolean Ap_mo_1=false;
	boolean Ap_mo_2=false;
	boolean Ap_mo_3=false;
	boolean Ap_mo_4=false;
	boolean Ap_2_de=false;
	boolean Ap_3_de=false;
	boolean Ap_4_de=false;
	boolean Ap_5_de=false;
	boolean V_cab_1=false;
	boolean V_cab_2=false;
	boolean V_cab_3=false;
	boolean V_cab_4=false;
	boolean V_cab_5=false;
	boolean Voy_m_1=false;
	boolean Voy_m_2=false;
	boolean Voy_m_3=false;
	boolean Voy_m_4=false;
	boolean Voy_d_2=false;
	boolean Voy_d_3=false;
	boolean Voy_d_4=false;
	boolean Voy_d_5=false;
	
	boolean Dr1=false;
	boolean Dr2=false;
	boolean Dr3=false;
	boolean Dr4=false;
	boolean Dr5=false;
	boolean Dm1=false;
	boolean Dm2=false;
	boolean Dm3=false;
	boolean Dm4=false;
	boolean Dd2=false;
	boolean Dd3=false;
	boolean Dd4=false;
	boolean Dd5=false;
	
	
	
	boolean Porteouverte;
	boolean Reparation=false;
	boolean Arret;
	boolean Bloquer;
	
	int CurrentLevel=0;
	int LastLevel=0;
	
	boolean Destination;
	
	boolean init;
	boolean Nodemand;
	///Fonction///
	
	public static void main(String[] args) {
		PApplet.main("Class.Main");

	}
    public void settings(){
    	fullScreen();
    }
    public void setup(){
    	frameRate(60);
    	background(226,212,212);
    	noStroke();
    	rectMode(CORNER);
    	Fct.Afficher_General(this);
    	
    }
    public void draw(){
    	test();
    	Fct.AfficherPorte(Porte_et1,Porte_et2,Porte_et3,Porte_et4,Porte_et5);
    	Fct.Mont_Cab(Mont_cab);
    	Fct.Desc_Cab(Desc_cab);
    	Program();
    }

    	

    public void test() {
    	if(Fct.y>=696-2) {Det_et_5=true;}else {Det_et_5=false;}
    	if((Fct.y>=696-174-2)&&(Fct.y<=696-174+2)) {Det_et_4=true;}else {Det_et_4=false;}
    	if((Fct.y>=696-328-20-2)&&(Fct.y<=696-328-20+2)) {Det_et_3=true;}else {Det_et_3=false;}
    	if((Fct.y>=696-492-30-2)&&(Fct.y<=696-492-30+2)) {Det_et_2=true;}else {Det_et_2=false;}
    	if((Fct.y<=2)&&(Fct.y>=0)) {Det_et_1=true;CurrentLevel=1;}else {Det_et_1=false;}
    	//
    	if((mouseX>=136)&&(mouseX<=186)&&(mouseY>=135)&&(mouseY<=185)&&mousePressed) {Ap_cab_1=true;}else {Ap_cab_1=false;}
    	if((mouseX>=136+1*(92))&&(mouseX<=186+1*(92))&&(mouseY>=135)&&(mouseY<=185)&&mousePressed) {Ap_cab_2=true;}else {Ap_cab_2=false;}
    	if((mouseX>=136+2*(92))&&(mouseX<=186+2*(92))&&(mouseY>=135)&&(mouseY<=185)&&mousePressed) {Ap_cab_3=true;}else {Ap_cab_3=false;}
    	if((mouseX>=136+3*(92))&&(mouseX<=186+3*(92))&&(mouseY>=135)&&(mouseY<=185)&&mousePressed) {Ap_cab_4=true;}else {Ap_cab_4=false;}
    	if((mouseX>=136+4*(92))&&(mouseX<=186+4*(92))&&(mouseY>=135)&&(mouseY<=185)&&mousePressed) {Ap_cab_5=true;}else {Ap_cab_5=false;}
    	//
    	if((mouseX>=1108)&&(mouseX<=1132)&&(mouseY>=138+4*(174))&&(mouseY<=194+4*(174))&&mousePressed) {Ap_mo_1=true;}else {Ap_mo_1=false;}
    	if((mouseX>=1108)&&(mouseX<=1132)&&(mouseY>=138+3*(174))&&(mouseY<=194+3*(174))&&mousePressed) {Ap_mo_2=true;}else {Ap_mo_2=false;}
    	if((mouseX>=1108)&&(mouseX<=1132)&&(mouseY>=138+2*(174))&&(mouseY<=194+2*(174))&&mousePressed) {Ap_mo_3=true;}else {Ap_mo_3=false;}
    	if((mouseX>=1108)&&(mouseX<=1132)&&(mouseY>=138+1*(174))&&(mouseY<=194+1*(174))&&mousePressed) {Ap_mo_4=true;}else {Ap_mo_4=false;}
    	
    	if((mouseX>=1108)&&(mouseX<=1132)&&(mouseY>=210+0*(174))&&(mouseY<=266+0*(174))&&mousePressed) {Ap_5_de=true;}else {Ap_5_de=false;}
    	if((mouseX>=1108)&&(mouseX<=1132)&&(mouseY>=210+1*(174))&&(mouseY<=266+1*(174))&&mousePressed) {Ap_4_de=true;}else {Ap_4_de=false;}
    	if((mouseX>=1108)&&(mouseX<=1132)&&(mouseY>=210+2*(174))&&(mouseY<=266+2*(174))&&mousePressed) {Ap_3_de=true;}else {Ap_3_de=false;}
    	if((mouseX>=1108)&&(mouseX<=1132)&&(mouseY>=210+3*(174))&&(mouseY<=266+3*(174))&&mousePressed) {Ap_2_de=true;}else {Ap_2_de=false;}
    	//
    	Fct.On_Off_Cab_1(V_cab_1);
    	Fct.On_Off_Cab_2(V_cab_2);
    	Fct.On_Off_Cab_3(V_cab_3);
    	Fct.On_Off_Cab_4(V_cab_4);
    	Fct.On_Off_Cab_5(V_cab_5);
    	Fct.On_Off_desc_2(Voy_d_2);
    	Fct.On_Off_desc_3(Voy_d_3);
    	Fct.On_Off_desc_4(Voy_d_4);
    	Fct.On_Off_desc_5(Voy_d_5);
    	Fct.On_Off_Mont_1(Voy_m_1);
    	Fct.On_Off_Mont_2(Voy_m_2);
    	Fct.On_Off_Mont_3(Voy_m_3);
    	Fct.On_Off_Mont_4(Voy_m_4);
    	Fct.On_Off_Urgence(Bp_atu);
    }
    public void mouseClicked() {
    	if((mouseX>=815)&&(mouseX<=825)&&(mouseY>=170+4*(174))&&(mouseY<=170+4*(174)+64)) {Porte_et1=!Porte_et1;}
    	if((mouseX>=815)&&(mouseX<=825)&&(mouseY>=170+3*(174))&&(mouseY<=170+3*(174)+64)) {Porte_et2=!Porte_et2;}
    	if((mouseX>=815)&&(mouseX<=825)&&(mouseY>=170+2*(174))&&(mouseY<=170+2*(174)+64)) {Porte_et3=!Porte_et3;}
    	if((mouseX>=815)&&(mouseX<=825)&&(mouseY>=170+1*(174))&&(mouseY<=170+1*(174)+64)) {Porte_et4=!Porte_et4;}
    	if((mouseX>=815)&&(mouseX<=825)&&(mouseY>=170+0*(174))&&(mouseY<=170+0*(174)+64)) {Porte_et5=!Porte_et5;}
    	if((mouseX>=136+2*(92))&&(mouseX<=186+2*(92))&&(mouseY>=335)&&(mouseY<=385)) {Cmd_r_s=!Cmd_r_s;}
    	if((mouseX>=136+2*(92))&&(mouseX<=186+2*(92))&&(mouseY>=435)&&(mouseY<=485)) {Bp_atu=!Bp_atu;}
    	print(CurrentLevel);
    }
    
    public void Program() {
    	Porteouverte=(!Det_et_1&&!Porte_et1)||(!Det_et_2&&!Porte_et2)||(!Det_et_3&&!Porte_et3)||(!Det_et_4&&!Porte_et4)||(!Det_et_5&&!Porte_et5);
    	Arret=Porteouverte||Bp_atu;
    	Nodemand=!Dr1&&!Dr2&&!Dr3&&!Dr4&&!Dr5;
    	
    	if(Arret) {
    		Mont_cab=false;Desc_cab=false;
    		Reparation=true;
    		Dd2=false;Dd3=false;Dd4=false;Dd5=false;
    		Dm1=false;Dm2=false;Dm3=false;Dm4=false;
    		Dr1=false;Dr2=false;Dr3=false;Dr4=false;Dr5=false;
    		Voy_m_1=false;Voy_m_2=false;Voy_m_3=false;Voy_m_4=false;
    		V_cab_1=false;V_cab_2=false;V_cab_3=false;V_cab_4=false;V_cab_5=false;
    		Voy_d_2=false;Voy_d_3=false;Voy_d_4=false;Voy_d_5=false;
    		
    	}else if(Reparation) {
    		if(Ap_cab_1) {Desc_cab=true;}
    		if(Det_et_1) {
    			CurrentLevel=1;
    			LastLevel=2;
    			Destination=true;
    			Desc_cab=false;
    			Reparation=false;}
    	}else {
    		
    		
    		
	    	if(CurrentLevel==0) {
	    		Desc_cab=true;
	    		init=true;
	    	}
	    	//Detecter les niveaux
	    	if((Det_et_1||Det_et_2||Det_et_3||Det_et_4)&&init) {Desc_cab=false;init=false;}
	    	
	    	if(Det_et_1) {CurrentLevel=1;LastLevel=2;}
	    	else if(Det_et_2) {CurrentLevel=2;if(Mont_cab) {LastLevel=1;}else if(Desc_cab) {LastLevel=3;}}
	    	else if(Det_et_3) {CurrentLevel=3;if(Mont_cab) {LastLevel=2;}else if(Desc_cab) {LastLevel=4;}}
	    	else if(Det_et_4) {CurrentLevel=4;if(Mont_cab) {LastLevel=3;}else if(Desc_cab) {LastLevel=5;}}
	    	else if(Det_et_5) {CurrentLevel=5;LastLevel=4;}
	    	if(Ap_cab_1) {V_cab_1=true;}else {V_cab_1=false;}
	    	if(Ap_mo_1) {Dm1=true;}if(Dm1) {Voy_m_1=true;}else {Voy_m_1=false;}
	    	if(Ap_mo_2) {Dm2=true;}if(Dm2) {Voy_m_2=true;}else {Voy_m_2=false;}
	    	if(Ap_mo_3) {Dm3=true;}if(Dm3) {Voy_m_3=true;}else {Voy_m_3=false;}
	    	if(Ap_mo_4) {Dm4=true;}if(Dm4) {Voy_m_4=true;}else {Voy_m_4=false;}
	    	if(Ap_2_de) {Dd2=true;}if(Dd2) {Voy_d_2=true;}else {Voy_d_2=false;}
	    	if(Ap_3_de) {Dd3=true;}if(Dd3) {Voy_d_3=true;}else {Voy_d_3=false;}
	    	if(Ap_4_de) {Dd4=true;}if(Dd4) {Voy_d_4=true;}else {Voy_d_4=false;}
	    	if(Ap_5_de) {Dd5=true;}if(Dd5) {Voy_d_5=true;}else {Voy_d_5=false;}
	    	if(Ap_cab_1) {Dr1=true;}if(Dr1) {V_cab_1=true;}else {V_cab_1=false;}
	    	if(Ap_cab_2) {Dr2=true;}if(Dr2) {V_cab_2=true;}else {V_cab_2=false;}
	    	if(Ap_cab_3) {Dr3=true;}if(Dr3) {V_cab_3=true;}else {V_cab_3=false;}
	    	if(Ap_cab_4) {Dr4=true;}if(Dr4) {V_cab_4=true;}else {V_cab_4=false;}
	    	if(Ap_cab_5) {Dr5=true;}if(Dr5) {V_cab_5=true;}else {V_cab_5=false;}
	    	
	    	//Stopper L'assensseur
	    	if(Det_et_1&&(Dr1||Dm1)) {
	    		Dr1=false;Dm1=false;Mont_cab=false;Desc_cab=false;Destination=true;Porte_et1=false;}
	    		
	    	
	    	else if(Det_et_2&&(Dr2||((Mont_cab||Nodemand)&&Dm2)||((Desc_cab||Nodemand)&&Dd2))) {
	    		if((Mont_cab||Nodemand)&&Dm2) {Dm2=false;}
	    		else if((Desc_cab||Nodemand)&&Dd2) {Dd2=false;}
	    		Dr2=false;Mont_cab=false;Desc_cab=false;Destination=true;Porte_et2=false;}
	    		
	    	
	    	else if(Det_et_3&&(Dr3||((Mont_cab||Nodemand)&&Dm3)||((Desc_cab||Nodemand)&&Dd3))) {
	    		if((Mont_cab||Nodemand)&&Dm3) {Dm3=false;}
	    		else if((Desc_cab||Nodemand)&&Dd3) {Dd3=false;}
	    		Dr3=false;Mont_cab=false;Desc_cab=false;Destination=true;Porte_et3=false;}
	    	
	    	
	    	else if(Det_et_4&&(Dr4||((Mont_cab||Nodemand)&&Dm4)||((Desc_cab||Nodemand)&&Dd4))) {
	    		if((Mont_cab||Nodemand)&&Dm4) {Dm4=false;}
	    		else if((Desc_cab||Nodemand)&&Dd4) {Dd4=false;}
	    		Dr4=false;Mont_cab=false;Desc_cab=false;Destination=true;Porte_et4=false;}
	    	
	    	
	    	else if(Det_et_5&&(Dr5||Dd5)) {
	    		Dr5=false;Dd5=false;Mont_cab=false;Desc_cab=false;Destination=true;Porte_et5=false;}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	//Faire repartir l'assenceur
	    	if(Det_et_1&&Porte_et1) {Destination=false;}else if(Det_et_1&&!Porte_et1) {Destination=true;}
	    	else if(Det_et_2&&Porte_et2) {Destination=false;}else if(Det_et_2&&!Porte_et2) {Destination=true;}
	    	else if(Det_et_3&&Porte_et3) {Destination=false;}else if(Det_et_3&&!Porte_et3) {Destination=true;}
	    	else if(Det_et_4&&Porte_et4) {Destination=false;}else if(Det_et_4&&!Porte_et4) {Destination=true;}
	    	else if(Det_et_5&&Porte_et5) {Destination=false;}else if(Det_et_5&&!Porte_et5) {Destination=true;}
	    	
	    	//Choisir la destination après chaque arrèt
	    	if(Det_et_1&&!Destination) {
	    		if(Dr1) {Mont_cab=false;Desc_cab=false;}else if(Dr2||Dr3||Dr4||Dr5) {
	    			Mont_cab=true;
	    			Desc_cab=false;}}
	    	else if(Det_et_2&&!Destination) {
	    		if(Dr2) {Mont_cab=false;Desc_cab=false;}else if(Dr1||Dr2||Dr3||Dr4||Dr5) {
	    			Mont_cab=(LastLevel>CurrentLevel&&(!Dr1))||(LastLevel<CurrentLevel&&!(!Dr3&&!Dr4&&!Dr5));
	    			Desc_cab=!Mont_cab;}}
	    	else if(Det_et_3&&!Destination) {
	    		if(Dr3) {Mont_cab=false;Desc_cab=false;}else if(Dr1||Dr2||Dr3||Dr4||Dr5) {
	    			Mont_cab=(LastLevel>CurrentLevel&&(!Dr1&&!Dr2))||(LastLevel<CurrentLevel&&!(!Dr4&&!Dr5));
	        		Desc_cab=!Mont_cab;}}
	    	else if(Det_et_4&&!Destination) {
	    		if(Dr4) {Mont_cab=false;Desc_cab=false;}else if(Dr1||Dr2||Dr3||Dr4||Dr5) {
	    			Mont_cab=(LastLevel>CurrentLevel&&(!Dr1&&!Dr2&&!Dr3))||(LastLevel<CurrentLevel&&(Dr5));
	    			Desc_cab=!Mont_cab;}}
	    	else if(Det_et_5&&!Destination) {
	    		if(Dr5) {Mont_cab=false;Desc_cab=false;}else if(Dr1||Dr2||Dr3||Dr4||Dr5) {
	    			Mont_cab=false;
	    			Desc_cab=true;}}
	    	//Appeler l'assenceur
	    	if(Nodemand&&!Destination) {
	    		if(Dm1) {
	    			Mont_cab=false;
	    			Desc_cab=true;
	    		}
	    	else if(Dm2||Dd2) {
	    		if(CurrentLevel>2) {
	    			Mont_cab=false;
	    			Desc_cab=true;
	    		}else if (CurrentLevel<2) {
	    			Mont_cab=true;
	    			Desc_cab=false;
	    		}}
	    	else if(Dm3||Dd3) {
	    		if(CurrentLevel>3) {
	    			Mont_cab=false;
	    			Desc_cab=true;
	    		}else if (CurrentLevel<3) {
	    			Mont_cab=true;
	    			Desc_cab=false;
	    		}}
	    	else if(Dm4||Dd4) {
	    		if(CurrentLevel>4) {
	    			Mont_cab=false;
	    			Desc_cab=true;
	    		}else if (CurrentLevel<4) {
	    			Mont_cab=true;
	    			Desc_cab=false;
	    		}}
	    	else if(Dd5) {
    			Mont_cab=true;
    			Desc_cab=false;
	    	}}
	    	
    }}
}














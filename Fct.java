// Code appartenant à Benjamin Robert, 1A Esisar, ne pas copier sans autorisations//
package Class;
import processing.core.PApplet;

public class Fct {
	public static PApplet p;
	public static int y=0;
	public static void Afficher_General(PApplet PARENT) {
		p= PARENT;
		p.fill(60);
		p.rect(810,100,300+40,900);
		draw_Cab(220);
		On_Off_Dor_1(true);
		On_Off_Dor_2(true);
		On_Off_Dor_3(true);
		On_Off_Dor_4(true);
		On_Off_Dor_5(true);
		p.fill(60);
		p.circle(161, 160, 61);p.circle(252, 160, 61);p.circle(343, 160, 61);p.circle(434, 160, 61);p.circle(525, 160, 61);
		p.circle(343, 460, 61);
		On_Off_Cab_1(false);On_Off_Cab_2(false);On_Off_Cab_3(false);On_Off_Cab_4(false);On_Off_Cab_5(false);
		On_Off_Urgence(false);
		p.fill(180);
		p.rect(1105,135+1*(174),30,62);p.rect(1105,135+2*(174),30,62);p.rect(1105,135+3*(174),30,62);p.rect(1105,135+4*(174),30,62);
		p.rect(1105,207+0*(174),30,62);p.rect(1105,207+1*(174),30,62);p.rect(1105,207+2*(174),30,62);p.rect(1105,207+3*(174),30,62);
		On_Off_Mont_1(false);On_Off_Mont_2(false);On_Off_Mont_3(false);On_Off_Mont_4(false);On_Off_desc_5(false);On_Off_desc_4(false);On_Off_desc_3(false);;On_Off_desc_2(false);
	}
	public static void On_Off_Urgence(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.circle(343, 460, 50);
		}else {
		p.fill(220,20,20);
		p.circle(343, 460, 50);
		}
		p.textSize(25);
		p.text("Arrèt Urgence", 270,520);
	}
	public static void draw_Cab(int dy) {
		y=dy;
		p.fill(170);
		p.rect(830,120,260,860);
		p.fill(20,120,160);
		p.rect(830,816-y,260,164);
		p.fill(255);
		p.rect(835,821-y,250,154);
		p.fill(20,120,160);
		p.rect(835,821-y+110,250,5);
		p.rect(835+58,821-y+110+5,6,39);
		p.rect(835+122,821-y+110+5,6,39);
		p.rect(835+192,821-y+110+5,6,39);
		p.fill(60);
		p.rect(830,120+164,260,10);
		p.rect(830,120+328+10,260,10);
		p.rect(830,120+492+20,260,10);
		p.rect(830,120+656+30,260,10);
	}
	public static void On_Off_Dor_1(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.rect(815,170+4*(174),10,64);
		}else {
		p.fill(220,20,20);
		p.rect(815,170+4*(174),10,64);
		}
	}
	public static void On_Off_Dor_2(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.rect(815,170+3*(174),10,64);
		}else {
		p.fill(220,20,20);
		p.rect(815,170+3*(174),10,64);
		}
	}
	public static void On_Off_Dor_3(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.rect(815,170+2*(174),10,64);
		}else {
		p.fill(220,20,20);
		p.rect(815,170+2*(174),10,64);
		}
	}
	public static void On_Off_Dor_4(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.rect(815,170+174,10,64);
		}else {
		p.fill(220,20,20);
		p.rect(815,170+174,10,64);
		}
	}
	public static void On_Off_Dor_5(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.rect(815,170,10,64);
		}else {
		p.fill(220,20,20);
		p.rect(815,170,10,64);
		}
	}
	public static void AfficherPorte(boolean State1,boolean State2,boolean State3,boolean State4,boolean State5) {
		On_Off_Dor_1(State1);
		On_Off_Dor_2(State2);
		On_Off_Dor_3(State3);
		On_Off_Dor_4(State4);
		On_Off_Dor_5(State5);
	}
	////////////
	public static void On_Off_Cab_1(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.circle(161, 160, 50);
		}else {
		p.fill(220,20,20);
		p.circle(161, 160, 50);
		}
		p.textSize(35);
		p.text("1", 151,225);
	}
	public static void On_Off_Cab_2(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.circle(252, 160, 50);
		}else {
		p.fill(220,20,20);
		p.circle(252, 160, 50);
		}
		p.textSize(35);
		p.text("2", 151+91,225);
	}
	public static void On_Off_Cab_3(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.circle(343, 160, 50);
		}else {
		p.fill(220,20,20);
		p.circle(343, 160, 50);
		}
		p.textSize(35);
		p.text("3", 151+91*2,225);
	}
	public static void On_Off_Cab_4(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.circle(434, 160, 50);
		}else {
		p.fill(220,20,20);
		p.circle(434, 160, 50);
		}
		p.textSize(35);
		p.text("4", 151+91*3,225);
	}
	public static void On_Off_Cab_5(boolean State) {
		if (State){
		p.fill(20,220,20);
		p.circle(525, 160, 50);
		}else {
		p.fill(220,20,20);
		p.circle(525, 160, 50);
		}
		p.textSize(35);
		p.text("5", 151+91*4,225);
	}
	public static void On_Off_Mont_1(boolean State) {
		if (State){
		p.fill(60,190,60);
		p.rect(1108,138+4*(174),24,56);
		}else {
		p.fill(90);
		p.rect(1108,138+4*(174),24,56);
		}
	}
	public static void On_Off_Mont_2(boolean State) {
		if (State){
		p.fill(60,190,60);
		p.rect(1108,138+3*(174),24,56);
		}else {
		p.fill(90);
		p.rect(1108,138+3*(174),24,56);
		}
	}
	public static void On_Off_Mont_3(boolean State) {
		if (State){
		p.fill(60,190,60);
		p.rect(1108,138+2*(174),24,56);
		}else {
		p.fill(90);
		p.rect(1108,138+2*(174),24,56);
		}
	}
	public static void On_Off_Mont_4(boolean State) {
		if (State){
		p.fill(60,190,60);
		p.rect(1108,138+1*(174),24,56);
		}else {
		p.fill(90);
		p.rect(1108,138+1*(174),24,56);
		}
	}
	public static void On_Off_desc_2(boolean State) {
		if (State){
		p.fill(60,190,60);
		p.rect(1108,210+3*(174),24,56);
		}else {
		p.fill(90);
		p.rect(1108,210+3*(174),24,56);
		}
	}
	public static void On_Off_desc_3(boolean State) {
		if (State){
		p.fill(60,190,60);
		p.rect(1108,210+2*(174),24,56);
		}else {
		p.fill(90);
		p.rect(1108,210+2*(174),24,56);
		}
	}
	public static void On_Off_desc_4(boolean State) {
		if (State){
		p.fill(60,190,60);
		p.rect(1108,210+1*(174),24,56);
		}else {
		p.fill(90);
		p.rect(1108,210+1*(174),24,56);
		}
	}
	public static void On_Off_desc_5(boolean State) {
		if (State){
		p.fill(60,190,60);
		p.rect(1108,210+0*(174),24,56);
		}else {
		p.fill(90);
		p.rect(1108,210+0*(174),24,56);
		}
	}
	public static void Mont_Cab(boolean State) {
		if (State){draw_Cab(y+2);
		}else {}
	}
	public static void Desc_Cab(boolean State) {
		if (State){draw_Cab(y-2);
		}else {}
	}
}
 

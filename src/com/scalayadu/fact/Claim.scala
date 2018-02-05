package com.scalayadu.fact

class Claim {
  	var claim_id = ""
	var batch_id = ""
	var prov_pin = ""
	var Concat_prod_code = ""
	//diagnosis_codes
	var dx_code_1 = ""
	var dx_code_2 = ""
	var dx_code_3 = ""
	var dx_code_4 = ""
	var dx_code_5 = ""
	var dx_code_6 = ""
	var dx_code_7 = ""
	var dx_code_8 = ""
	var dx_code_9 = ""
	var dx_code_10 = ""
	var dx_code_11 = ""
	var dx_code_12 = ""
	// service_units
	var unit_count_1 = 0.0
	var unit_count_2 = 0.0
	var unit_count_3 = 0.0
	var unit_count_4 = 0.0
	var unit_count_5 = 0.0
	var unit_count_6 = 0.0
	var unit_count_7 = 0.0
	var unit_count_8 = 0.0
	var unit_count_9 = 0.0
	var unit_count_10 = 0.0
	var unit_count_11 = 0.0
	var unit_count_12 = 0.0
	var unit_count_13 = 0.0
	var unit_count_14 = 0.0
	var unit_count_15 = 0.0
	var unit_count_16 = 0.0
	var unit_count_17 = 0.0
	var unit_count_18 = 0.0

	var service_units = 0
	var Fraud_exclusion_code = ""
	var Fraud_inclusion_code = ""
	var flagged = false
	
	
	
	def getClaim_id() {
		return claim_id;
	}
	def setClaim_id(claim_id:String) {
		this.claim_id = claim_id;
	}
	def getBatch_id() {
		return batch_id;
	}
	def setBatch_id(batch_id:String) {
		this.batch_id = batch_id;
	}
	def getProv_pin() {
		if(prov_pin == null)
			return "";
		return prov_pin;
	}
	def setProv_pin(prov_pin:String) {
		this.prov_pin = prov_pin;
	}
	def getConcat_prod_code() {
		return Concat_prod_code;
	}
	def setConcat_prod_code(concat_prod_code:String) {
		Concat_prod_code = concat_prod_code;
	}
	def getDx_code_1() {
		return dx_code_1;
	}
	def setDx_code_1(dx_code_1:String) {
		this.dx_code_1 = dx_code_1;
	}
	def getDx_code_2() {
		return dx_code_2;
	}
	def setDx_code_2(dx_code_2:String) {
		this.dx_code_2 = dx_code_2;
	}
	def getDx_code_3() {
		return dx_code_3;
	}
	def setDx_code_3(dx_code_3:String) {
		this.dx_code_3 = dx_code_3;
	}
	def getDx_code_4() {
		return dx_code_4;
	}
	def setDx_code_4(dx_code_4:String) {
		this.dx_code_4 = dx_code_4;
	}
	def getDx_code_5() {
		return dx_code_5;
	}
	def setDx_code_5(dx_code_5:String) {
		this.dx_code_5 = dx_code_5;
	}
	def getDx_code_6() {
		return dx_code_6;
	}
	def setDx_code_6(dx_code_6:String) {
		this.dx_code_6 = dx_code_6;
	}
	def getDx_code_7() {
		return dx_code_7;
	}
	def setDx_code_7(dx_code_7:String) {
		this.dx_code_7 = dx_code_7;
	}
	def getDx_code_8() {
		return dx_code_8;
	}
	def setDx_code_8(dx_code_8:String) {
		this.dx_code_8 = dx_code_8;
	}
	def getDx_code_9() {
		return dx_code_9;
	}
	def setDx_code_9(dx_code_9:String) {
		this.dx_code_9 = dx_code_9;
	}
	def getDx_code_10() {
		return dx_code_10;
	}
	def setDx_code_10(dx_code_10:String) {
		this.dx_code_10 = dx_code_10;
	}
	def getDx_code_11() {
		return dx_code_11;
	}
	def setDx_code_11(dx_code_11:String) {
		this.dx_code_11 = dx_code_11;
	}
	def getDx_code_12() {
		return dx_code_12;
	}
	def setDx_code_12(dx_code_12:String) {
		this.dx_code_12 = dx_code_12;
	}
	def getUnit_count_1() {
		return unit_count_1;
	}
	def setUnit_count_1(unit_count_1:Float) {
		this.unit_count_1 = unit_count_1;
	}
	def getUnit_count_2() {
		return unit_count_2;
	}
	def setUnit_count_2(unit_count_2:Float) {
		this.unit_count_2 = unit_count_2;
	}
	def getUnit_count_3() {
		return unit_count_3;
	}
	def setUnit_count_3(unit_count_3:Float) {
		this.unit_count_3 = unit_count_3;
	}
	def getUnit_count_4() {
		return unit_count_4;
	}
	def setUnit_count_4(unit_count_4:Float) {
		this.unit_count_4 = unit_count_4;
	}
	def getUnit_count_5() {
		return unit_count_5;
	}
	def setUnit_count_5(unit_count_5:Float) {
		this.unit_count_5 = unit_count_5;
	}
	def getUnit_count_6() {
		return unit_count_6;
	}
	def setUnit_count_6(unit_count_6:Float) {
		this.unit_count_6 = unit_count_6;
	}
	def getUnit_count_7() {
		return unit_count_7;
	}
	def setUnit_count_7(unit_count_7:Float) {
		this.unit_count_7 = unit_count_7;
	}
	def getUnit_count_8() {
		return unit_count_8;
	}
	def setUnit_count_8(unit_count_8:Float) {
		this.unit_count_8 = unit_count_8;
	}
	def getUnit_count_9() {
		return unit_count_9;
	}
	def setUnit_count_9(unit_count_9:Float) {
		this.unit_count_9 = unit_count_9;
	}
	def getUnit_count_10() {
		return unit_count_10;
	}
	def setUnit_count_10(unit_count_10:Float) {
		this.unit_count_10 = unit_count_10;
	}
	def getUnit_count_11() {
		return unit_count_11;
	}
	def setUnit_count_11(unit_count_11:Float) {
		this.unit_count_11 = unit_count_11;
	}
	def getUnit_count_12() {
		return unit_count_12;
	}
	def setUnit_count_12(unit_count_12:Float) {
		this.unit_count_12 = unit_count_12;
	}
	def getUnit_count_13() {
		return unit_count_13;
	}
	def setUnit_count_13(unit_count_13:Float) {
		this.unit_count_13 = unit_count_13;
	}
	def getUnit_count_14() {
		return unit_count_14;
	}
	def setUnit_count_14(unit_count_14:Float) {
		this.unit_count_14 = unit_count_14;
	}
	def getUnit_count_15() {
		return unit_count_15;
	}
	def setUnit_count_15(unit_count_15:Float) {
		this.unit_count_15 = unit_count_15;
	}
	def getUnit_count_16() {
		return unit_count_16;
	}
	def setUnit_count_16(unit_count_16:Float) {
		this.unit_count_16 = unit_count_16;
	}
	def getUnit_count_17() {
		return unit_count_17;
	}
	def setUnit_count_17(unit_count_17:Float) {
		this.unit_count_17 = unit_count_17;
	}
	def getUnit_count_18() {
		return unit_count_18;
	}
	def setUnit_count_18(unit_count_18:Float) {
		this.unit_count_18 = unit_count_18;
	}
	def getService_units() {
		return service_units;
	}
	def setService_units(service_units:Int) {
		this.service_units = service_units;
	}
	def getFraud_exclusion_code() {
		return Fraud_exclusion_code;
	}
	def setFraud_exclusion_code(fraud_exclusion_code: String) {
		Fraud_exclusion_code = fraud_exclusion_code;
	}
	
	def getFraud_inclusion_code() {
		return Fraud_inclusion_code;
	}
	def setFraud_inclusion_code(fraud_inclusion_code:String) {
		// for the first rule tagging this, there shouldn't be a pipe delimiter
		//Fraud_inclusion_code = this.Fraud_inclusion_code.length() > 0 ? this.getFraud_inclusion_code() + "|" + fraud_inclusion_code:fraud_inclusion_code;
	}
	def isFlagged() {
		return flagged;
	}
	def setFlagged(flagged:Boolean) {
		this.flagged = flagged;
	}

	
	
	
}




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
	var unit_count_1 = BigDecimal(0)
	var unit_count_2 = BigDecimal(0)
	var unit_count_3 = BigDecimal(0)
	var unit_count_4 = BigDecimal(0)
	var unit_count_5 = BigDecimal(0)
	var unit_count_6 = BigDecimal(0)
	var unit_count_7 = BigDecimal(0)
	var unit_count_8 = BigDecimal(0)
	var unit_count_9 = BigDecimal(0)
	var unit_count_10 = BigDecimal(0)
	var unit_count_11 = BigDecimal(0)
	var unit_count_12 = BigDecimal(0)
	var unit_count_13 = BigDecimal(0)
	var unit_count_14 = BigDecimal(0)
	var unit_count_15 = BigDecimal(0)
	var unit_count_16 = BigDecimal(0)
	var unit_count_17 = BigDecimal(0)
	var unit_count_18 = BigDecimal(0)

	var service_units = 0
	var Fraud_exclusion_code = ""
	var Fraud_inclusion_code = ""
	var flagged = false
	
	
	
	def getClaim_id():String = {
		claim_id
	}
	def setClaim_id(claim_id:String) {
		this.claim_id = claim_id;
	}
	def getBatch_id():String = {
		batch_id;
	}
	def setBatch_id(batch_id:String) {
		this.batch_id = batch_id;
	}
	def getProv_pin():String =  {
		if(prov_pin == null)
			return "";
		return prov_pin;
	}
	def setProv_pin(prov_pin:String) {
		this.prov_pin = prov_pin;
	}
	def getConcat_prod_code():String = {
		return Concat_prod_code;
	}
	def setConcat_prod_code(concat_prod_code:String) {
		Concat_prod_code = concat_prod_code;
	}
	def getDx_code_1():String = {
		return dx_code_1;
	}
	def setDx_code_1(dx_code_1:String) {
		this.dx_code_1 = dx_code_1;
	}
	def getDx_code_2():String = {
		return dx_code_2;
	}
	def setDx_code_2(dx_code_2:String) {
		this.dx_code_2 = dx_code_2;
	}
	def getDx_code_3():String = {
		return dx_code_3;
	}
	def setDx_code_3(dx_code_3:String) {
		this.dx_code_3 = dx_code_3;
	}
	def getDx_code_4():String = {
		return dx_code_4;
	}
	def setDx_code_4(dx_code_4:String) {
		this.dx_code_4 = dx_code_4;
	}
	def getDx_code_5():String = {
		return dx_code_5;
	}
	def setDx_code_5(dx_code_5:String) {
		this.dx_code_5 = dx_code_5;
	}
	def getDx_code_6():String = {
		return dx_code_6;
	}
	def setDx_code_6(dx_code_6:String) {
		this.dx_code_6 = dx_code_6;
	}
	def getDx_code_7():String = {
		return dx_code_7;
	}
	def setDx_code_7(dx_code_7:String) {
		this.dx_code_7 = dx_code_7;
	}
	def getDx_code_8():String = {
		return dx_code_8;
	}
	def setDx_code_8(dx_code_8:String) {
		this.dx_code_8 = dx_code_8;
	}
	def getDx_code_9():String = {
		return dx_code_9;
	}
	def setDx_code_9(dx_code_9:String) {
		this.dx_code_9 = dx_code_9;
	}
	def getDx_code_10():String = {
		return dx_code_10;
	}
	def setDx_code_10(dx_code_10:String) {
		this.dx_code_10 = dx_code_10;
	}
	def getDx_code_11():String = {
		return dx_code_11;
	}
	def setDx_code_11(dx_code_11:String) {
		this.dx_code_11 = dx_code_11;
	}
	def getDx_code_12():String = {
		return dx_code_12;
	}
	def setDx_code_12(dx_code_12:String) {
		this.dx_code_12 = dx_code_12;
	}
	def getUnit_count_1():BigDecimal = {
		return unit_count_1;
	}
	def setUnit_count_1(unit_count_1:BigDecimal) {
		this.unit_count_1 = unit_count_1;
	}
	def getUnit_count_2():BigDecimal = {
		return unit_count_2;
	}
	def setUnit_count_2(unit_count_2:BigDecimal) {
		this.unit_count_2 = unit_count_2;
	}
	def getUnit_count_3():BigDecimal = {
		return unit_count_3;
	}
	def setUnit_count_3(unit_count_3:BigDecimal) {
		this.unit_count_3 = unit_count_3;
	}
	def getUnit_count_4():BigDecimal = {
		return unit_count_4;
	}
	def setUnit_count_4(unit_count_4:BigDecimal) {
		this.unit_count_4 = unit_count_4;
	}
	def getUnit_count_5():BigDecimal = {
		return unit_count_5;
	}
	def setUnit_count_5(unit_count_5:BigDecimal) {
		this.unit_count_5 = unit_count_5;
	}
	def getUnit_count_6():BigDecimal = {
		return unit_count_6;
	}
	def setUnit_count_6(unit_count_6:BigDecimal) {
		this.unit_count_6 = unit_count_6;
	}
	def getUnit_count_7():BigDecimal = {
		return unit_count_7;
	}
	def setUnit_count_7(unit_count_7:BigDecimal) {
		this.unit_count_7 = unit_count_7;
	}
	def getUnit_count_8():BigDecimal = {
		return unit_count_8;
	}
	def setUnit_count_8(unit_count_8:BigDecimal) {
		this.unit_count_8 = unit_count_8;
	}
	def getUnit_count_9():BigDecimal = {
		return unit_count_9;
	}
	def setUnit_count_9(unit_count_9:BigDecimal) {
		this.unit_count_9 = unit_count_9;
	}
	def getUnit_count_10():BigDecimal = {
		return unit_count_10;
	}
	def setUnit_count_10(unit_count_10:BigDecimal) {
		this.unit_count_10 = unit_count_10;
	}
	def getUnit_count_11():BigDecimal = {
		return unit_count_11;
	}
	def setUnit_count_11(unit_count_11:BigDecimal) {
		this.unit_count_11 = unit_count_11;
	}
	def getUnit_count_12():BigDecimal = {
		return unit_count_12;
	}
	def setUnit_count_12(unit_count_12:BigDecimal) {
		this.unit_count_12 = unit_count_12;
	}
	def getUnit_count_13():BigDecimal = {
		return unit_count_13;
	}
	def setUnit_count_13(unit_count_13:BigDecimal) {
		this.unit_count_13 = unit_count_13;
	}
	def getUnit_count_14():BigDecimal = {
		return unit_count_14;
	}
	def setUnit_count_14(unit_count_14:BigDecimal) {
		this.unit_count_14 = unit_count_14;
	}
	def getUnit_count_15():BigDecimal = {
		return unit_count_15;
	}
	def setUnit_count_15(unit_count_15:BigDecimal) {
		this.unit_count_15 = unit_count_15;
	}
	def getUnit_count_16():BigDecimal = {
		return unit_count_16;
	}
	def setUnit_count_16(unit_count_16:BigDecimal) {
		this.unit_count_16 = unit_count_16;
	}
	def getUnit_count_17():BigDecimal = {
		return unit_count_17;
	}
	def setUnit_count_17(unit_count_17:BigDecimal) {
		this.unit_count_17 = unit_count_17;
	}
	def getUnit_count_18():BigDecimal = {
		return unit_count_18;
	}
	def setUnit_count_18(unit_count_18:BigDecimal) {
		this.unit_count_18 = unit_count_18;
	}
	def getService_units():BigDecimal = {
		return service_units;
	}
	def setService_units(service_units:Int) {
		this.service_units = service_units;
	}
	def getFraud_exclusion_code():String = {
		return Fraud_exclusion_code;
	}
	def setFraud_exclusion_code(fraud_exclusion_code: String) {
		Fraud_exclusion_code = fraud_exclusion_code;
	}
	
	def getFraud_inclusion_code():String = {
		return Fraud_inclusion_code;
	}
	def setFraud_inclusion_code(fraud_inclusion_code:String) {
		// for the first rule tagging this, there shouldn't be a pipe delimiter
		//Fraud_inclusion_code = this.Fraud_inclusion_code.length() > 0 ? this.getFraud_inclusion_code() + "|" + fraud_inclusion_code:fraud_inclusion_code;
	}
	def isFlagged():Boolean= {
		return flagged;
	}
	def setFlagged(flagged:Boolean) {
		this.flagged = flagged;
	}

	
	
	
}




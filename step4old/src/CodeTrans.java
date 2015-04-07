import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CodeTrans {
	public ArrayList<String> TinyOut = new ArrayList<String>(); // Stores the TinyOutlist
	public LinkedHashMap<String, String> IrRegMap = new LinkedHashMap<String, String>(); //Stores the mapping between $T and r;
    private int RegCount = -1;														

	public CodeTrans(SymbolTable table, ArrayList<String> outputList) {
		for (Scope scope : table.scopestack.subList(0, table.scopestack.size())) {
			if (scope.Scopetype.equalsIgnoreCase("GLOBAL")) { // only scope
																// global exists
				for (String key : scope.symbolMap.keySet()) {
					if (((Symbol) scope.symbolMap.get(key)).getType().contains(
							"INT")) {
						TinyOut.add("var " + key);
					}
					if (((Symbol) scope.symbolMap.get(key)).getType().contains(
							"FLOAT")) {
						TinyOut.add("var " + key);
					}
					
					if (((Symbol) scope.symbolMap.get(key)).getType().contains(
							"STRING")) {
						TinyOut.add("str " + key +" " +((Symbol) scope.symbolMap.get(key)).getValue()); //str newline "\n"
					}
					
					
				}
			}
			
			else {
				;  //only global scope now
			}
		}
		
		for (int i=0; i<outputList.size(); i++){   //iterate over the outputList
			if (outputList.get(i).contains("STOREI"))
			{
				String[] SubString = outputList.get(i).split("\\s+"); //split the String by any space
				if(SubString[2].contains("$")){ // Storei 20 $T1
				  String reg = createreg(); //r0
				  TinyOut.add("move "+SubString[1]+ " "+reg); //move 20 r0
				  IrRegMap.put(SubString[2],reg);
				}
				
				else{ //store $t1 a
					TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+SubString[2]);
				}
					
			}
			
			if (outputList.get(i).contains("STOREF"))
			{
				String[] SubString = outputList.get(i).split("\\s+"); //split the String by any space
				if(SubString[2].contains("$")){ // Storef 20.0 $T1
				  String reg = createreg(); //r0
				  TinyOut.add("move "+SubString[1]+" "+reg); //move 20 r0
				  IrRegMap.put(SubString[2],reg);
				}
				
				else{ //store $t1 a
					TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+SubString[2]);
				}
					
			}
			
			/*write operation */
			if  (outputList.get(i).contains("WRITEI")){ //writei a
			  String[] SubString = outputList.get(i).split("\\s+"); //split the String by any space
			  TinyOut.add("sys writei "+SubString[1]);	
			}
			
			if  (outputList.get(i).contains("WRITEF")){ //writef a
				  String[] SubString = outputList.get(i).split("\\s+"); //split the String by any space
				  TinyOut.add("sys writer "+SubString[1]+" ");	
			}
			
			if  (outputList.get(i).contains("WRITES")){ //writes a
				  String[] SubString = outputList.get(i).split("\\s+"); //split the String by any space
				  TinyOut.add("sys writes "+SubString[1]);	
			}
			
			
			/*read operation*/
			if  (outputList.get(i).contains("READI")){ //readi a
				  String[] SubString = outputList.get(i).split("\\s+"); //split the String by any space
				  TinyOut.add("sys readi "+SubString[1]+" ");	
			}
				
		    if  (outputList.get(i).contains("READF")){ //readf a
					  String[] SubString = outputList.get(i).split("\\s+"); //split the String by any space
					  TinyOut.add("sys readr "+SubString[1]+" ");	
			}
				
		    if  (outputList.get(i).contains("READS")){ //reads a
					  String[] SubString = outputList.get(i).split("\\s+"); //split the String by any space
					  TinyOut.add("sys reads "+SubString[1]);	
			}
			
		    /*+*/
		    if (outputList.get(i).contains("ADDI")){// ADDI $T5 c $T6 // ADDI C $T4 $T9// ADDI $T9 $T7 $T10 //ADDI a b $T5
				  String[] SubString = outputList.get(i).split("\\s+"); 
				  String reg = createreg(); //r0
                  if(SubString[1].contains("$")) //op1 $T
                	  TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+reg);
                  else //op1 c
                	  TinyOut.add("move "+SubString[1]+" "+reg);
                  IrRegMap.put(SubString[3], reg); //set new mapping
                  
                  if(SubString[2].contains("$")) //op2 $T
                	  TinyOut.add("addi "+IrRegMap.get(SubString[2])+" "+reg);
                  else
                	  TinyOut.add("addi "+SubString[2]+" "+reg);
		    }
		    
		    if (outputList.get(i).contains("ADDF")){// ADDF $T5 c $T6 // ADDF C $T4 $T9// ADDF $T9 $T7 $T10 //ADDF a b $T5
				  String[] SubString = outputList.get(i).split("\\s+"); 
				  String reg = createreg(); //r0
                  if(SubString[1].contains("$")) //op1 $T
                	  TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+reg);
                  else //op1 c
                	  TinyOut.add("move "+SubString[1]+" "+reg);
                  IrRegMap.put(SubString[3], reg); //set new mapping
                  
                  if(SubString[2].contains("$")) //op2 $T
                	  TinyOut.add("addr "+IrRegMap.get(SubString[2])+" "+reg);
                  else
                	  TinyOut.add("addr "+SubString[2]+" "+reg);
		    }
		    /*-*/
		    if (outputList.get(i).contains("SUBI")){ //SUBI $T7 a $T8
				  String[] SubString = outputList.get(i).split("\\s+"); 
				  String reg = createreg(); //r0
                  if(SubString[1].contains("$")) //op1 $T
                	  TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+reg);
                  else //op1 c
                	  TinyOut.add("move "+SubString[1]+" "+reg);
                  IrRegMap.put(SubString[3], reg); //set new mapping
                  
                  if(SubString[2].contains("$")) //op2 $T
                	  TinyOut.add("subi "+IrRegMap.get(SubString[2])+" "+reg);
                  else
                	  TinyOut.add("subi "+SubString[2]+" "+reg);
		    }
		    
		    if (outputList.get(i).contains("SUBF")){ //SUBI $T7 a $T8
				  String[] SubString = outputList.get(i).split("\\s+"); 
				  String reg = createreg(); //r0
                  if(SubString[1].contains("$")) //op1 $T
                	  TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+reg);
                  else //op1 c
                	  TinyOut.add("move "+SubString[1]+" "+reg);
                  IrRegMap.put(SubString[3], reg); //set new mapping
                  
                  if(SubString[2].contains("$")) //op2 $T
                	  TinyOut.add("subr "+IrRegMap.get(SubString[2])+" "+reg);
                  else
                	  TinyOut.add("subr "+SubString[2]+" "+reg);
		    }
		    
		    
		    /*x*/
		    if (outputList.get(i).contains("MULTI")){ //SUBI $T7 a $T8
				  String[] SubString = outputList.get(i).split("\\s+"); 
				  String reg = createreg(); //r0
                  if(SubString[1].contains("$")) //op1 $T
                	  TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+reg);
                  else //op1 c
                	  TinyOut.add("move "+SubString[1]+" "+reg);
                  IrRegMap.put(SubString[3], reg); //set new mapping
                  
                  if(SubString[2].contains("$")) //op2 $T
                	  TinyOut.add("muli "+IrRegMap.get(SubString[2])+" "+reg);
                  else
                	  TinyOut.add("muli "+SubString[2]+" "+reg);
		    }
		    
		    if (outputList.get(i).contains("MULTF")){ //SUBI $T7 a $T8
				  String[] SubString = outputList.get(i).split("\\s+"); 
				  String reg = createreg(); //r0
                  if(SubString[1].contains("$")) //op1 $T
                	  TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+reg);
                  else //op1 c
                	  TinyOut.add("move "+SubString[1]+" "+reg);
                  IrRegMap.put(SubString[3], reg); //set new mapping
                  
                  if(SubString[2].contains("$")) //op2 $T
                	  TinyOut.add("mulr "+IrRegMap.get(SubString[2])+" "+reg);
                  else
                	  TinyOut.add("mulr "+SubString[2]+" "+reg);
		    }
		    
		    /*/*/
		    if (outputList.get(i).contains("DIVI")){ //SUBI $T7 a $T8
				  String[] SubString = outputList.get(i).split("\\s+"); 
				  String reg = createreg(); //r0
                  if(SubString[1].contains("$")) //op1 $T
                	  TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+reg);
                  else //op1 c
                	  TinyOut.add("move "+SubString[1]+" "+reg);
                  IrRegMap.put(SubString[3], reg); //set new mapping
                  
                  if(SubString[2].contains("$")) //op2 $T
                	  TinyOut.add("divi "+IrRegMap.get(SubString[2])+" "+reg);
                  else
                	  TinyOut.add("divi "+SubString[2]+" "+reg);
		    }
		    
		    if (outputList.get(i).contains("DIVF")){ //SUBI $T7 a $T8
				  String[] SubString = outputList.get(i).split("\\s+"); 
				  String reg = createreg(); //r0
                  if(SubString[1].contains("$")) //op1 $T
                	  TinyOut.add("move "+IrRegMap.get(SubString[1])+" "+reg);
                  else //op1 c
                	  TinyOut.add("move "+SubString[1]+" "+reg);
                  IrRegMap.put(SubString[3], reg); //set new mapping
                  
                  if(SubString[2].contains("$")) //op2 $T
                	  TinyOut.add("divr "+IrRegMap.get(SubString[2])+" "+reg);
                  else
                	  TinyOut.add("divr "+SubString[2]+" "+reg);
		    }
		    
		    if (outputList.get(i).contains("RET")){ //may need further modification
			   TinyOut.add("sys halt");
		    }
		    
		    else   //further modification  like Link, LABEL
		    	;
		    
		    
		}
		 
		
	}
	public String createreg()
	{
		//Register number limitation need to be added in the future
		RegCount+=1; 
		return "r"+Integer.toString(RegCount); //return r0
	}
    
    public void printIR() {
      String result = "";
      for (int i = 0; i < TinyOut.size()-1; i++) {
     
      result = result + TinyOut.get(i);
      result = result + "\n";
    }
      result = result+ TinyOut.get(TinyOut.size()-1);
     System.out.println(";tiny code\n"+result);
     //return result;    
  }

}

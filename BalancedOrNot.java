package com.test.abstraction;

public class BalancedOrNot {
	static int[] balancedOrNot(String[] expressions,int[] maxReplacements){
		int[] arrBal=new int[expressions.length];
		for(int i=0;i<expressions.length;i++){
			char[] strArr=expressions[i].toCharArray();
			for(int j=0;j<strArr.length;j++){
				if(strArr[j]=='<'){
					int newIndex=j+1;
					for(int k=newIndex;k<strArr.length;k++){
						if(strArr[k]=='>'){
							strArr[j]='w';
							strArr[k]='w';
							break;
						}
					}
				}
			}
			int maxcount=0;
			int openCount=0;
			int closeCount=0;
			for(char c:strArr){				
				if(c=='<'){
					openCount=openCount+1;					
				}else if(c=='>'){
					closeCount=closeCount+1;
				}
			}
			if(openCount>closeCount){
				maxcount=openCount;
			}else{
				maxcount=closeCount;
			}
			if(maxcount==0){
				arrBal[i]=1;
				continue;
			}else if(maxcount<=maxReplacements[i]){
				arrBal[i]=1;
				continue;
			}else{
				arrBal[i]=0;
				continue;
			}
			
		}
		return arrBal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] expressions={"<>>>", "<>>>>"};
		int[] maxReplacements={2,2};
		int[] arrBal=balancedOrNot(expressions, maxReplacements);
		for(int i:arrBal){
			System.out.print(i+" ");
		}
		

	}

}

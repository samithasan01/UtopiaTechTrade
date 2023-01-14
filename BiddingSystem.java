package UtopiaTechTrade;


public class BiddingSystem {

	
	public static void listItemOrService(itemOrService iOrS, String description) { 
		iOrS.setListStatus(true);	
		iOrS.setDescriptionOfWhatUserIsLookingFor(description);
	}
	
	public static void unlistIOrS(itemOrService iOrS) { 
		iOrS.setListStatus(false);		
	}
	
	public static void removeListedIOrS(itemOrService iOrS) {
		
			iOrS.setListStatus(false);
			iOrS.setDeletedStatus(true);
			UtopiaTechTrade.update();
		}
		
	}	


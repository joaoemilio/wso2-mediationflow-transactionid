package com.agiplan.internal;

import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class TransactionIdGenarator extends AbstractMediator { 
	private static final Log log = LogFactory.getLog(TransactionIdGenarator.class);
	
	UUID uuid = UUID.randomUUID();
	String transactionID;
	
	public boolean mediate(MessageContext context) { 
        transactionID = uuid.toString();
	    context.setProperty("TransactionID", transactionID);
	    return true;
	    }

	    public void setAGIPLAN_ID(String newValue) {
	    	transactionID=newValue;
	    }

	    public String getAGIPLAN_ID() {
	     return transactionID;
	    }
    }



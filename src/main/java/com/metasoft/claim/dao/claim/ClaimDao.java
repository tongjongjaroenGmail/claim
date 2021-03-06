package com.metasoft.claim.dao.claim;

import java.util.Date;
import java.util.List;

import com.metasoft.claim.bean.paging.ClaimPaging;
import com.metasoft.claim.dao.AbstractDao;
import com.metasoft.claim.model.ClaimType;
import com.metasoft.claim.model.JobStatus;
import com.metasoft.claim.model.SecUser;
import com.metasoft.claim.model.StdInsurance;
import com.metasoft.claim.model.TblClaimRecovery;

public interface ClaimDao extends AbstractDao<TblClaimRecovery, Integer>{
	public ClaimPaging searchPaging(Date jobDateStart,Date jobDateEnd,StdInsurance partyInsurance,
			Date maturityDate,ClaimType claimType, String claimNumber,JobStatus jobStatus, int start,int length,SecUser user);
	
	public boolean checkDupClaimNumber(String claimNumber);
	
	public List<TblClaimRecovery> searchExport(Date jobDateStart,Date jobDateEnd,StdInsurance partyInsurance,
			Date maturityDate,ClaimType claimType, String claimNumber,JobStatus jobStatus);
	   
	public ClaimPaging searchBillingPaging(Date closeDateStart,Date closeDateEnd,StdInsurance partyInsurance,
			ClaimType claimType, int start,int length);
}
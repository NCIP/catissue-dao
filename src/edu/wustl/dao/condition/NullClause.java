/*L
 * Copyright Washington University in St. Louis, SemanticBits, Persistent Systems, Krishagni.
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/catissue-dao/LICENSE.txt for details.
 */

/**
 * <p>Title: NullClause Class>
 * <p>Description:	NullClause implements the Condition interface,
 * it is used to generate null clause of query.</p>
 * Copyright:    Copyright (c) year
 * Company: Washington University, School of Medicine, St. Louis.
 * @version 1.00
 * @author kalpana_thakur
 */

package edu.wustl.dao.condition;

import edu.wustl.dao.util.DAOConstants;
import edu.wustl.dao.util.DAOUtility;

/**
 * @author kalpana_thakur
 * This class is used to generate null clause of the query
 */
public class NullClause implements Condition
{


	/**
	 * Name of the where Column.
	 */
	private final String columnName;

	/**
	 * Name of the class or table.
	 */
	private String sourceObjectName;

	/**
	 * The public constructor to restrict creating object without
	 * initializing mandatory members.
	 * @param columnName : Name of the Column
	 * @param sourceObjectName :Name of the Table or class name.
	 */
	public NullClause (String columnName ,String sourceObjectName)
	{
		this.columnName = columnName;
		this.sourceObjectName = sourceObjectName;
	}

	/**
	 * The public constructor to restrict creating object without
	 * initializing mandatory members.
	 * @param columnName :Name of the Column
	 */
	public NullClause (String columnName)
	{
		this.columnName = columnName;
	}



	/**
	 * @return class name or table name.
	 */
	public String getSourceObjectName()
	{
		return sourceObjectName;
	}

	/**
	 * @param sourceObjectName set the class name or table name.
	 */
	public void setSourceObjectName(String sourceObjectName)
	{
		this.sourceObjectName = sourceObjectName;
	}

	/**
	 *  This method will generate the Null clause of Query.
	 * @return String:
	 */
	public String buildSql()
	{
		StringBuffer strBuff = new StringBuffer(DAOConstants.TAILING_SPACES);

		String sourceObject = DAOUtility.getInstance().parseClassName(sourceObjectName);

		strBuff.append(sourceObject).append(DAOConstants.DOT_OPERATOR).
		append(columnName).append(DAOConstants.TAILING_SPACES).append(DAOConstants.NULL_CONDITION).
		append(DAOConstants.TAILING_SPACES);

		return strBuff.toString();
	}

}

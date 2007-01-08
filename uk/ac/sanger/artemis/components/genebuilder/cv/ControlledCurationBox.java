/* ControlledCurationBox.java
 *
 * created: 2007
 *
 * This file is part of Artemis
 *
 * Copyright (C) 2007  Genome Research Limited
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 **/

package uk.ac.sanger.artemis.components.genebuilder.cv;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.Box;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.DateFormatter;

import uk.ac.sanger.artemis.components.Splash;
import uk.ac.sanger.artemis.components.genebuilder.cv.CvBoxA.DateVerifier;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.util.StringVector;

class ControlledCurationBox extends CvBoxA
{
  private Box xBox;
  private int value_index;
  private JTextField termTextField;
  private JFormattedTextField dateField;
  private String origQualifierString;
  private Qualifier origQualifier;
  
  public ControlledCurationBox(final Qualifier qualifier,
                               final String qualifierString,
                               final int value_index,
                               final Dimension dimension)
  {
    this.origQualifier = qualifier;
    this.origQualifierString = qualifierString;
    this.value_index  = value_index;
    this.xBox = Box.createHorizontalBox();
    
    String term = getField("term=", qualifierString);
    termTextField = new JTextField(term);
    termTextField.setEditable(false);
    termTextField.setToolTipText("term column");
    termTextField.setPreferredSize(dimension);
    termTextField.setMaximumSize(dimension);
    termTextField.setCaretPosition(0);
    xBox.add(termTextField);
    
    String date = getField("date=", qualifierString);
    
    Date this_date = getDate(date);
    dateField = new JFormattedTextField(new SimpleDateFormat("yyyyMMdd"));
    dateField.setInputVerifier(new DateVerifier());
    dateField.setValue(this_date);
    dateField.setToolTipText("date column");
    dateField.setPreferredSize(dimension);
    dateField.setMaximumSize(dimension);
    xBox.add(dateField);
  }


  
  protected boolean isQualifierChanged()
  {
    String old = getField("date=", origQualifierString);
    if(!old.equals(dateField.getText()))
      return true;
    return false;
  }

  protected void updateQualifier(QualifierVector qv)
  {
    StringVector values = origQualifier.getValues();
    values.remove(value_index);
    String updatedQualifierString = updateQualifierString();
    
    Splash.logger4j.debug(origQualifierString);
    Splash.logger4j.debug(updatedQualifierString);
    values.add(value_index, updatedQualifierString);
    
    int index = qv.indexOfQualifierWithName(origQualifier.getName());
    
    origQualifier = new Qualifier(origQualifier.getName(), values);
    qv.remove(index);
    qv.add(index, origQualifier);
  }
  
  private String updateQualifierString()
  {
    String newQualifierString = origQualifierString;
    
    String old = getField("date=", origQualifierString);
    if(!old.equals(dateField.getText()))
    {
      newQualifierString = changeField("date=", dateField.getText().trim(), 
                                       newQualifierString);
    }
    
    return newQualifierString;
  }
  
  protected Box getBox()
  {
    return xBox;
  }
}
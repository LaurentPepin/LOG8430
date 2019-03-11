/*
 * @(#)SendToBackAction.java
 *
 * Copyright (c) 2003-2008 by the original authors of JHotDraw and all its
 * contributors. All rights reserved.
 *
 * You may not use, copy or modify this file, except in compliance with the 
 * license agreement you entered into with the copyright holders. For details
 * see accompanying license terms.
 */
package org.jhotdraw.draw.action;

import java.util.*;
import javax.swing.undo.*;
import org.jhotdraw.draw.*;
import org.jhotdraw.util.ResourceBundleUtil;

public abstract class SAMActionProposal {

}

public class SendToBackSAMActionProposal implements SAMActionProposal {
  public Figure figure;

  public SendToBackSAMActionProposal(Figure figure) {
    this.figure = figure;
  }
}

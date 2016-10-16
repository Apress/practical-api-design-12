/*
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at http://www.netbeans.org/cddl.html
 * or http://www.netbeans.org/cddl.txt.
 *
 * When distributing Covered Code, include this CDDL Header Notice in each file
 * and include the License file at http://www.netbeans.org/cddl.txt.
 * If applicable, add the following below the CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
 */

package org.netbeans.apifest.custom;

import org.netbeans.apifest.boolcircuit.Circuit;

/**
 */
public class Gte extends Circuit{

    private Circuit in1;
    private Circuit in2;
    
    public Gte (Circuit in1, Circuit in2) {
        if (in1 == null || in2 == null)
            throw new IllegalArgumentException();
        this.in1 = in1;
        this.in2 = in2;
    }
    
    protected double doEvaluate(double... inputs) {
        return (in1.evaluateFuzzy(inputs) >= in2.evaluateFuzzy(inputs))? 1.0: 0.0;
    }

    public int maxInputs() {
        return Math.max(in1.maxInputs(), in2.maxInputs());
    }
    
}

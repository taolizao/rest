package com.gate.rest.manager;

import com.gate.rest.constdefinition.*;

public class OperationManager {
    OperType opertype = OperType.UNKNOWN;
    private boolean[] operTypeFlags = new boolean[opertype.getMaxOperno()];

    public OperationManager() {
        for (int i = 0; i < operTypeFlags.length; i++) {
            operTypeFlags[i] = false;
        }
    }

    public void initOperationFlags(String[] args)  {
        int operno = 0;

        for (String arg : args) {
//            System.out.println("Argument:" + arg);
            operno = opertype.getOpernoWithOpername(arg);
            if (operno > OperType.UNKNOWN.getOperno()) {
                this.operTypeFlags[operno] = true;
            } else {
                System.out.println("Unknown argumet:" + arg);
            }
        }
    }

    public boolean isOperAllowed(String opername) {
        int operno = opertype.getOpernoWithOpername(opername);
        if (operno > OperType.UNKNOWN.getOperno()) {
            return operTypeFlags[operno];
        } else {
            return false;
        }
    }
}

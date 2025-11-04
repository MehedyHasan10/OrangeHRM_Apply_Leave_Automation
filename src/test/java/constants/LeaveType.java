package constants;

import lombok.Getter;

public enum LeaveType {
    CAN_PERSONAL("CAN - Personal"),
    CAN_FMLA("CAN - FMLA"),
    CAN_VACATION("CAN - Vacation");

    @Getter
    private final String value;

    LeaveType(String value) {
        this.value = value;
    }
}

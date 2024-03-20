package person.nicholas.crm.entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import lombok.Data;

import java.util.List;

@Data
public class Vendor {
    private final SimpleIntegerProperty vendorId = new SimpleIntegerProperty(this, "vendorId");
    private final SimpleStringProperty businessName = new SimpleStringProperty(this, "businessName");
    private final SimpleIntegerProperty feedbackScore = new SimpleIntegerProperty(this, "feedbackScore");
    private final SimpleStringProperty geographicalPresence = new SimpleStringProperty(this, "geographicalPresence");
    // 省略其他部分

    public int getVendorId() {
        return vendorId.get();
    }

    public SimpleIntegerProperty vendorIdProperty() {
        return vendorId;
    }

    public String getBusinessName() {
        return businessName.get();
    }

    public SimpleStringProperty businessNameProperty() {
        return businessName;
    }

    public int getFeedbackScore() {
        return feedbackScore.get();
    }

    public SimpleIntegerProperty feedbackScoreProperty() {
        return feedbackScore;
    }

    public String getGeographicalPresence() {
        return geographicalPresence.get();
    }

    public SimpleStringProperty geographicalPresenceProperty() {
        return geographicalPresence;
    }

    public void setBusinessName(String businessName) {
        this.businessName.set(businessName);
    }

    // 省略其他部分
}
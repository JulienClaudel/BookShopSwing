package BookShop.Author;

import java.sql.Date;
import java.util.Vector;

public class CompleteAuthor 
{
    
    private Long authorId;
    private String authorFirstname;
    private String authorLastname;
    private Date authorBirthdate;
    private Date authorDeathdate;
    private String authorStatus;
    
    public CompleteAuthor(Long authorId, String authorFirstname, String authorLastname, Date authorBirthdate, Date authorDeathDate, String authorStatus) 
    {
        this.authorId = authorId;
        this.authorFirstname = authorFirstname;
        this.authorLastname = authorLastname;
        this.authorBirthdate = authorBirthdate;
        this.authorDeathdate = authorDeathDate;
        this.authorStatus = authorStatus;
    }
    
    public Vector getVector() 
    {
        Vector v = new Vector();
            v.add(authorId);
            v.add(authorFirstname);
            v.add(authorLastname);
            v.add(authorBirthdate);
            v.add(authorDeathdate);
            v.add(authorStatus);
            
            return v;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    public String getAuthorFirstname() {
        return authorFirstname;
    }

    public void setAuthorFirstname(String authorFirstname) {
        this.authorFirstname = authorFirstname;
    }

    public Date getAuthorBirthdate() {
        return authorBirthdate;
    }

    public void setAuthorBirthdate(Date authorBirthdate) {
        this.authorBirthdate = authorBirthdate;
    }

    public Date getAuthorDeathdate() {
        return authorDeathdate;
    }

    public void setAuthorDeathdate(Date authorDeathdate) {
        this.authorDeathdate = authorDeathdate;
    }
    
    public String getAuthorStatus() {
        return authorStatus;
    }
    
    public void setAuthorStatus(String authorStatus) {
        this.authorStatus = authorStatus;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (authorId != null ? authorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompleteAuthor)) {
            return false;
        }
        CompleteAuthor other = (CompleteAuthor) object;
        if ((this.authorId == null && other.authorId != null) || (this.authorId != null && !this.authorId.equals(other.authorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + authorId;
    }
}

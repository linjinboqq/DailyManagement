package dailymanagement.demo.bean;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * 项目表
 * pid：项目ID
 * pname：项目名
 * pRealname：牵头人
 * beginTime：创建时间
 * closeTime：结项时间
 * introduction：项目简介
 *
 */
@Component
public class Project {
    private Integer pid;

    private String pname;

    private String pRealname;

    private Date beginTime;

    private Date closeTime;

    private String introduction;

    private List<Game> game;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getpRealname() {
        return pRealname;
    }

    public void setpRealname(String pRealname) {
        this.pRealname = pRealname == null ? null : pRealname.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public List<Game> getGame() {
        return game;
    }

    public void setGame(List<Game> game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pRealname='" + pRealname + '\'' +
                ", beginTime=" + beginTime +
                ", closeTime=" + closeTime +
                ", introduction='" + introduction + '\'' +
                ", game=" + game +
                '}';
    }
}
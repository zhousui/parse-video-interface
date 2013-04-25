package org.apache.nutch.parse.html.video.database.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.nutch.parse.html.video.database.model.VideoPlayinfoTbl;
import org.apache.nutch.parse.html.video.database.model.VideoPlayinfoTblExample;

public interface VideoPlayinfoTblMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    int countByExample(VideoPlayinfoTblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    int deleteByExample(VideoPlayinfoTblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    int insert(VideoPlayinfoTbl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    int insertSelective(VideoPlayinfoTbl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    List<VideoPlayinfoTbl> selectByExample(VideoPlayinfoTblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    VideoPlayinfoTbl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    int updateByExampleSelective(@Param("record") VideoPlayinfoTbl record, @Param("example") VideoPlayinfoTblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    int updateByExample(@Param("record") VideoPlayinfoTbl record, @Param("example") VideoPlayinfoTblExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    int updateByPrimaryKeySelective(VideoPlayinfoTbl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_playinfo_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    int updateByPrimaryKey(VideoPlayinfoTbl record);
}
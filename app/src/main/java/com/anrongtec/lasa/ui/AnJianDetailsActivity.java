package com.anrongtec.lasa.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.anrongtec.lasa.R;
import com.anrongtec.lasa.entity.CheckInfoBaseEntity;
import com.anrongtec.lasa.entity.CheckInfoZBCarEntity;
import com.anrongtec.lasa.entity.CheckInfoZBPersonEntity;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * 无证化安检   详情页面。 由{@link AnJianListActivity}跳转过来
 */
public class AnJianDetailsActivity extends BaseActivity {

    //****************************      人员信息    ****************************
    @BindView(R.id.tv_anjian_detail_person_info_nameIn)
    TextView tvAnjianDetailPersonInfoNameIn;
    @BindView(R.id.tv_anjian_detail_person_info_idCardIn)
    TextView tvAnjianDetailPersonInfoIdCardIn;
    @BindView(R.id.tv_anjian_detail_person_info_genderIn)
    TextView tvAnjianDetailPersonInfoGenderIn;
    @BindView(R.id.tv_anjian_detail_person_info_nationIn)
    TextView tvAnjianDetailPersonInfoNationIn;
    @BindView(R.id.tv_anjian_detail_person_info_hcjlidIn)
    TextView tvAnjianDetailPersonInfoHcjlidIn;
    @BindView(R.id.tv_anjian_detail_person_info_eventidIn)
    TextView tvAnjianDetailPersonInfoEventidIn;
    @BindView(R.id.tv_anjian_detail_person_info_rylbIn)
    TextView tvAnjianDetailPersonInfoRylbIn;
    @BindView(R.id.tv_anjian_detail_person_info_tasknameIn)
    TextView tvAnjianDetailPersonInfoTasknameIn;
    @BindView(R.id.tv_anjian_detail_person_info_checkpointidIn)
    TextView tvAnjianDetailPersonInfoCheckpointidIn;
    @BindView(R.id.tv_anjian_detail_person_info_checkuserIn)
    TextView tvAnjianDetailPersonInfoCheckuserIn;
    @BindView(R.id.tv_anjian_detail_person_info_equiptidIn)
    TextView tvAnjianDetailPersonInfoEquiptidIn;
    @BindView(R.id.tv_anjian_detail_person_info_deptNameIn)
    TextView tvAnjianDetailPersonInfoDeptNameIn;
    @BindView(R.id.tv_anjian_detail_person_info_pcsjIn)
    TextView tvAnjianDetailPersonInfoPcsjIn;
    @BindView(R.id.iv_anjian_detail_person_info_avatar)
    ImageView ivAnjianDetailPersonInfoAvatar;
    @BindView(R.id.rl_anjian_detail_person_info)
    RelativeLayout rlAnjianDetailPersonInfo;

    //****************************      人员中标信息      ****************************
    @BindView(R.id.tv_anjian_detail_person_bid_xmIn)
    TextView tvAnjianDetailPersonBidXmIn;
    @BindView(R.id.tv_anjian_detail_person_bid_sfzhIn)
    TextView tvAnjianDetailPersonBidSfzhIn;
    @BindView(R.id.tv_anjian_detail_person_bid_rylbIn)
    TextView tvAnjianDetailPersonBidRylbIn;
    @BindView(R.id.tv_anjian_detail_person_bid_aqmsIn)
    TextView tvAnjianDetailPersonBidAqmsIn;
    @BindView(R.id.tv_anjian_detail_person_bid_clfsIn)
    TextView tvAnjianDetailPersonBidClfsIn;
    @BindView(R.id.tv_anjian_detail_person_bid_linkIn)
    TextView tvAnjianDetailPersonBidLinkIn;
    @BindView(R.id.tv_anjian_detail_person_bid_linkPhoneIn)
    TextView tvAnjianDetailPersonBidLinkPhoneIn;
    @BindView(R.id.tv_anjian_detail_person_bid_rwmcIn)
    TextView tvAnjianDetailPersonBidRwmcIn;
    @BindView(R.id.tv_anjian_detail_person_bid_rwidIn)
    TextView tvAnjianDetailPersonBidRwidIn;
    @BindView(R.id.tv_anjian_detail_person_bid_pfirstidIn)
    TextView tvAnjianDetailPersonBidPfirstidIn;
    @BindView(R.id.tv_anjian_detail_person_bid_pveridIn)
    TextView tvAnjianDetailPersonBidPveridIn;
    @BindView(R.id.rl_anjian_detail_person_bid_info)
    RelativeLayout rlAnjianDetailPersonBidInfo;

    //*****************************       车辆中标信息      ***************************
    @BindView(R.id.tv_anjian_detail_car_bid_cllbIn)
    TextView tvAnjianDetailCarBidCllbIn;
    @BindView(R.id.tv_anjian_detail_car_bid_clfsIn)
    TextView tvAnjianDetailCarBidClfsIn;
    @BindView(R.id.tv_anjian_detail_car_bid_aqmsIn)
    TextView tvAnjianDetailCarBidAqmsIn;
    @BindView(R.id.tv_anjian_detail_car_bid_cphmIn)
    TextView tvAnjianDetailCarBidCphmIn;
    @BindView(R.id.tv_anjian_detail_car_bid_linkPersonIn)
    TextView tvAnjianDetailCarBidLinkPersonIn;
    @BindView(R.id.tv_anjian_detail_car_bid_linkPhoneIn)
    TextView tvAnjianDetailCarBidLinkPhoneIn;
    @BindView(R.id.tv_anjian_detail_car_bid_rwmcIn)
    TextView tvAnjianDetailCarBidRwmcIn;
    @BindView(R.id.tv_anjian_detail_car_bid_rwidIn)
    TextView tvAnjianDetailCarBidRwidIn;
    @BindView(R.id.tv_anjian_detail_car_bid_pfirstidIn)
    TextView tvAnjianDetailCarBidPfirstidIn;
    @BindView(R.id.tv_anjian_detail_car_bid_pveridIn)
    TextView tvAnjianDetailCarBidPveridIn;
    @BindView(R.id.tv_anjian_detail_car_bid_czxmIn)
    TextView tvAnjianDetailCarBidCzxmIn;
    @BindView(R.id.tv_anjian_detail_car_bid_clsbdmIn)
    TextView tvAnjianDetailCarBidClsbdmIn;
    @BindView(R.id.tv_anjian_detail_car_bid_clysIn)
    TextView tvAnjianDetailCarBidClysIn;
    @BindView(R.id.tv_anjian_detail_car_bid_fdjhIn)
    TextView tvAnjianDetailCarBidFdjhIn;
    @BindView(R.id.rl_anjian_detail_car_bid_info)
    RelativeLayout rlAnjianDetailCarBidInfo;
    //人员信息
    private CheckInfoBaseEntity mPerson;
    //中标人员信息
    private CheckInfoZBPersonEntity mPersonBid;
    //中标车辆信息
    private CheckInfoZBCarEntity mCarBid;

    //根据type来判断，当前页面展示哪些信息
    private int mType;
    private static final int TYPE_PERSON = 1;
    private static final int TYPE_PERSON_BID = 2;
    private static final int TYPE_CAR_BID = 4;

    private static final String EXTRA_PERSON = "extra_person";
    private static final String EXTRA_PERSON_BID = "extra_person_bid";
    private static final String EXTRA_CAR_BID = "extra_car_bid";
    private static final String EXTRA_TYPE = "extra_type";


    public static void startPerson(Context context, @NonNull CheckInfoBaseEntity baseEntity) {
        Intent intent = new Intent(context, AnJianDetailsActivity.class);
        intent.putExtra(EXTRA_PERSON, baseEntity);
        intent.putExtra(EXTRA_TYPE, TYPE_PERSON);
        context.startActivity(intent);
    }

    public static void startPersonBid(Context context, @NonNull CheckInfoZBPersonEntity
            zbPersonEntity) {
        Intent intent = new Intent(context, AnJianDetailsActivity.class);
        intent.putExtra(EXTRA_PERSON_BID, zbPersonEntity);
        intent.putExtra(EXTRA_TYPE, TYPE_PERSON_BID);
        context.startActivity(intent);
    }

    public static void startCarBid(Context context, @NonNull CheckInfoZBCarEntity zbCarEntity) {
        Intent intent = new Intent(context, AnJianDetailsActivity.class);
        intent.putExtra(EXTRA_CAR_BID, zbCarEntity);
        intent.putExtra(EXTRA_TYPE, TYPE_CAR_BID);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anjian_details);
        ButterKnife.bind(this);
        setTitle("信息详情");
        if (getIntentData()) {

        }

    }

    /**
     * 获取传递参数
     */
    private boolean getIntentData() {

        mType = getIntent().getIntExtra(EXTRA_TYPE, 0);
        if (mType == TYPE_PERSON) {
            mPerson = (CheckInfoBaseEntity) getIntent().getSerializableExtra(EXTRA_PERSON);

            rlAnjianDetailPersonInfo.setVisibility(View.VISIBLE);
            setPersonView();

        } else if (mType == TYPE_PERSON_BID) {
            mPersonBid = (CheckInfoZBPersonEntity) getIntent().getSerializableExtra
                    (EXTRA_PERSON_BID);

            rlAnjianDetailPersonBidInfo.setVisibility(View.VISIBLE);
            setPersonBidView();


        } else if (mType == TYPE_CAR_BID) {
            mCarBid = (CheckInfoZBCarEntity) getIntent().getSerializableExtra(EXTRA_CAR_BID);

            rlAnjianDetailCarBidInfo.setVisibility(View.VISIBLE);
            setCarBidView();

        } else {
            ToastUtils.showShort("参数传递错误");
            return false;
        }
        return true;
    }

    /**
     * 设置人员信息
     */
    private void setPersonView() {
        tvAnjianDetailPersonInfoNameIn.setText(mPerson.getXM());
        tvAnjianDetailPersonInfoIdCardIn.setText(mPerson.getSFZH());
        tvAnjianDetailPersonInfoGenderIn.setText(mPerson.getXb());
        tvAnjianDetailPersonInfoNationIn.setText(mPerson.getMZ());
        tvAnjianDetailPersonInfoHcjlidIn.setText(mPerson.getId());
        tvAnjianDetailPersonInfoEventidIn.setText(mPerson.getCheckevent_id());
        tvAnjianDetailPersonInfoRylbIn.setText(mPerson.getRylb());
        tvAnjianDetailPersonInfoTasknameIn.setText(mPerson.getTask_names());
        tvAnjianDetailPersonInfoCheckpointidIn.setText(mPerson.getCheckpoint_id());
        tvAnjianDetailPersonInfoCheckuserIn.setText(mPerson.getCheck_user());
        tvAnjianDetailPersonInfoEquiptidIn.setText(mPerson.getEquipt_id());
        tvAnjianDetailPersonInfoDeptNameIn.setText(mPerson.getDept_name());
        tvAnjianDetailPersonInfoPcsjIn.setText(mPerson.getPcsj());
        Glide.with(this).load(mPerson.getXpUrl()).into(ivAnjianDetailPersonInfoAvatar);
    }

    /**
     * 设置中标人员信息
     */
    private void setPersonBidView() {
        tvAnjianDetailPersonBidXmIn.setText(mPersonBid.getXM());
        tvAnjianDetailPersonBidSfzhIn.setText(mPersonBid.getSFZH());
        tvAnjianDetailPersonBidRylbIn.setText(mPersonBid.getRYLB());
        tvAnjianDetailPersonBidAqmsIn.setText(mPersonBid.getAQMS());
        tvAnjianDetailPersonBidClfsIn.setText(mPersonBid.getCLFS());
        tvAnjianDetailPersonBidLinkIn.setText(mPersonBid.getBKLXR());
        tvAnjianDetailPersonBidLinkPhoneIn.setText(mPersonBid.getBKLXFS());
        tvAnjianDetailPersonBidRwmcIn.setText(mPersonBid.getRWMC());
        tvAnjianDetailPersonBidRwidIn.setText(mPersonBid.getRWID());
        tvAnjianDetailPersonBidPfirstidIn.setText(mPersonBid.getPFIRSTID());
        tvAnjianDetailPersonBidPveridIn.setText(mPersonBid.getPVERID());
    }

    /**
     * 设置中标车辆信息
     */
    private void setCarBidView() {
        tvAnjianDetailCarBidCllbIn.setText(mCarBid.getCLLB());
        tvAnjianDetailCarBidClfsIn.setText(mCarBid.getCLFS());
        tvAnjianDetailCarBidAqmsIn.setText(mCarBid.getAQMS());
        tvAnjianDetailCarBidCphmIn.setText(mCarBid.getCPHM());
        tvAnjianDetailCarBidLinkPersonIn.setText(mCarBid.getBKLXR());
        tvAnjianDetailCarBidLinkPhoneIn.setText(mCarBid.getBKLXFS());
        tvAnjianDetailCarBidRwmcIn.setText(mCarBid.getRWMC());
        tvAnjianDetailCarBidRwidIn.setText(mCarBid.getRWID());
        tvAnjianDetailCarBidPfirstidIn.setText(mCarBid.getPFIRSTID());
        tvAnjianDetailCarBidPveridIn.setText(mCarBid.getPVERID());
        tvAnjianDetailCarBidCzxmIn.setText(mCarBid.getCZXM());
        tvAnjianDetailCarBidClsbdmIn.setText(mCarBid.getCLSBDM());
        tvAnjianDetailCarBidClysIn.setText(mCarBid.getCLYS());
        tvAnjianDetailCarBidFdjhIn.setText(mCarBid.getFDJH());
    }

}
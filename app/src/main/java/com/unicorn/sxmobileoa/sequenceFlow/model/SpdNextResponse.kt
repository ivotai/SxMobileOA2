package com.unicorn.sxmobileoa.sequenceFlow.model

import com.unicorn.sxmobileoa.app.mess.model.Selector

data class SpdNextResponse(
        val spdid: String,
        val node: Node,
        val processInstanceId: String,
        val nextTask_sequenceFlow: List<NextTaskSequenceFlow>,
        val moduleCode: String,
        val nextTask_parallelGateway: List<Any>,
        val nextTask: List<NextTask>,
        val nextTask_includeGateway: List<Any>
)

data class NextTask(
        val approveType: Int,
        val assignPeson: String,
        val dealCourt: String,
        val dealPerson: String,
        val dealPersonId: String,
        val dealPersonRoles: String,
        val dealPersonRolesWay: String,
        val dealPersonRolesWayDep: String,
        val dealPersonType: String,
        val endTaskType: String,
        val flowCode: String,
        val isCjblr: String,
        val isDla: String,
        val jdsfmrxz: Int,
        val lastCourt: String,
        val lowerCourt: String,
        val mutiTask: Int,
        val nextLine: String,
        val nextTaskKey: String,
        val nextTaskName: String,
        val nextTaskShowName: String,
        val nextTaskType: String,
        val nextTaskUrl: String,
        val otherCourt: String,
        val otherDepId: String,
        val processDeployMentId: String,
        val sort: Int,
        val startPersonId: String,
        val taskCode: String
)

data class NextTaskSequenceFlow(
        val approveType: Int,
        val assignPeson: String,
        val dealCourt: String,
        val dealPerson: String,
        val dealPersonId: String,
        val dealPersonRoles: String,
        val dealPersonRolesWay: String,
        val dealPersonRolesWayDep: String,
        val dealPersonType: String,
        val endTaskType: String,
        val flowCode: String,
        val isCjblr: String,
        val isDla: String,
        val jdsfmrxz: Int,
        val lastCourt: String,
        val lowerCourt: String,
        val mutiTask: Int,
        val nextLine: String,
        val nextTaskKey: String,
        val nextTaskName: String,
        val nextTaskShowName: String,
        val nextTaskType: String,       // userType 单选forkTpye 其他 多选  end 结束
        val nextTaskUrl: String,
        val otherCourt: String,
        val otherDepId: String,
        val processDeployMentId: String,
        val sort: Int,
        val startPersonId: String,
        val taskCode: String
): Selector()

data class Node(
        val createUserId: String,
        val createUserName: String,
        val createuserid: String,
        val createusername: String,
        val flowcode: String,
        val flowname: String,
        val fydm: String,
        val gdlx: String,
        val id: String,
        val jdsfmrxz: Int,
        val ngrnode: Int,
        val nodeid: String,
        val nodemc: String,
        val qybz: Int,
        val remark: String,
        val sfdxtz: Int,
        val sfgz: Int,
        val sftxspyj: Int,
        val sfyjtz: Int,
        val sfyxgq: Int,
        val sfzdgd: Int,
        val smsTepId: String,
        val sort: Int,
        val spyjList: List<Any>,
        val spyjsfbt: Int,
        val sysTime: String,
        val systime: Systime,
        val tzbt: String,
        val tzfw: Int,
        val tzjd: String,
        val tznr: String,
        val updateTime: String,
        val whsfbt: Int,
        val xtlx: String,
        val yjsfzwlj: Int
)

data class Systime(
        val date: Int,
        val day: Int,
        val hours: Int,
        val minutes: Int,
        val month: Int,
        val nanos: Int,
        val seconds: Int,
        val time: Long,
        val timezoneOffset: Int,
        val year: Int
)